void main() {
  // إدخال بيانات الطالب مباشرة للاختبار السريع
  Student student1 = Student(
    name: 'Malak',
    email: 'malak@example.com',
    gpa: 3.8,
    age: 21,
    phoneNumber: '0123456789',
  );

  student1.displayStudentInfo();
}

class Student {
  String name;
  String email;
  double gpa;
  int age;
  String phoneNumber;

  Student({
    required this.name,
    required this.email,
    required this.gpa,
    required this.age,
    required this.phoneNumber,
  });

  void displayStudentInfo() {
    print('Name: $name');
    print('Email: $email');
    print('GPA: $gpa');
    print('Age: $age');
    print('Phone: $phoneNumber');
  }
}
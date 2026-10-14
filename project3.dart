 void main() {
    List<int>scores=[30,20,66,99];
    scores[0]=25;
    print(scores[0]);
    scores.add(100);
    scores.remove(20);
    scores.removeLast();
    print(scores);
    print(scores.indexOf(99));
    Set<String>names={"malak","Amr","ali"};
    names.add("mohamed");
    names.add("menna");
    names.remove("Amr");
    print(names);
    print(names.length);
}
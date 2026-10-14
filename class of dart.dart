void main() {
  var noodles = MenuItem("veg noodles", 9.99);
  var pizza = Pizza(["mushrooms", "peppers"], "veg volcano", 12.99);
  
  print(noodles.format());
  print(pizza.format());
}

class MenuItem {
  String title;
  double price;

  MenuItem(this.title, this.price);

  String format() {
    return '$title -> £$price';
  }
}

class Pizza extends MenuItem {
  List<String> toppings;

  Pizza(this.toppings, String title, double price) : super(title, price);

  @override
  String format() {
    var formattedToppings = 'Contains:';
    for (final t in toppings) {
      formattedToppings = '$formattedToppings $t';
    }
    return '$title -> £$price \n$formattedToppings';
  }
}

//void main() {
  //var myPizza = Pizza(["mushrooms", "peppers"], "veg volcano", 12.99);
 // print(myPizza.format());
//}
void main() {
  Map<String,String> planets={
    "frist":"mercury",
    "second":"venus",
    "third":"earth",
    "fourth":"mars",
    "fifth":"jupiter",
  };
  planets["sixth"]="uranus";
  print(planets.containsValue("earth"));
  print(planets.remove("third"));
  print(planets.keys);
  print(planets.values);
  print(planets);
}
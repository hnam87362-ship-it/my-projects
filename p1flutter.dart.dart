import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text('تطبيقي الأول')),
        body: Center(
          child: Text('أهلاً بكِ يا ملك في عالم فلاتر!'),
        ),
      ),
    );
  }
}
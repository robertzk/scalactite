val x = 0 to 10

x(5) // 5
x.count(_ > 3) // 7
x.drop(2) // 2 to 10
x.dropRight(2) // 0 to 8
x.exists(_ == 5) // true
x.filter(_ > 4) // 5 to 10
x.forall(y => 1.0 / (y + 1.0) > 0.01) // true
x.foreach(y => println(1.0 / y))

x.head // 0 
x.tail // 1 to 10
x.last // 10
x.init // 0 to 9
x.isEmpty // false
x.length // 11
x.map(_ + 1) // 1 to 11
x.reverse // 10 to 0

// x.toList.sort((s, t) => 1.0 / s < 1.0 / t) // This one breaks..?
//

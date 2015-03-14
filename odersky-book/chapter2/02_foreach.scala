List(1,2,3).foreach(x => println(x + 1))
// Can add type annotation
List(1,2,3).foreach((x: Int) => println(x + 1))

// Can even use a for expression
for(x <- List(1,2,3)) println(x + 1)

val x = List(1,2)
val y = List(3,4)
val z = x ::: y
println(x + " and " + y + " were not mutated, so " + z + " is a new list")

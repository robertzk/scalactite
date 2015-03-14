var foo = Set("Bar", "Baz")
foo += "Qux"
foo.+=("Wee") // another way

println(foo.contains("Qux")) // true

// scala.collection.immutable.HashSet < scala.collection.immutable.Set < scala.collection.Set
// scala.collection.mutable.HashSet < scala.collection.mutable.Set < scala.collection.Set



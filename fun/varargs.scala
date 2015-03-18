// A weird way to use variable args with existential types

def bah(many: (T forSome { type T <: Int })*): Int = many.sum
// bah(1,2,3) = 6

// Now how do we do we this for Doubles without type erasure? Probably Manifest?
def bah2(many: (T forSome { type T <: Double })*): T = many.sum
// bah(1, 2.0, 3) = 6.0


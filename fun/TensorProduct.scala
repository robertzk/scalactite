// Tensor products in Scala! 

implicit class FancyInt(val x: Int) extends AnyVal {
  def ⊗(b: FancyInt): FancyInt = FancyInt(x + b.x)
}

// Now 1 ⊗ 2 = 3.

// Exercise to the reader: Implement modules over a base ring in Scala,
// then implement tensor products of modules by writing the corresponding
// ⊗ operator.

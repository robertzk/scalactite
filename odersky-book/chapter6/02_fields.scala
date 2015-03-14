class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d

  override def toString = n + "/" + d
  def add(other: Rational): Rational =
    new Rational(
      n * other.denom + d * other.numer,
      d * other.denom
    )
}


class Rational(n: Int, d: Int) {
  require(d != 0) // Will prevent illegal construction
  override def toString = n + "/" + d
}


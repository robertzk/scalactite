// Re-creating left folds by hand!

class Foo(arr: Seq[Int]) {

  def foldLeft[B, A <% Int](value: B)(op: (A, B) => B) = {
    var out = value
    for (el <- arr) out = op(el.asInstanceOf[A], out)
    out
  }
}

object Bar extends App {
  assert(new Foo(Seq(1,2,3)).foldLeft(1) { (_:Int) + (_:Int) } == 1 + 1 + 2 + 3)
} // scalac fold_left.scala && scala Bar

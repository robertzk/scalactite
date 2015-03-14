import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) =
    for (arg <- args) println(arg + ": " + calculate(arg)) 
}

// scalac 03_singleton_checksum.scala 04_main.scala

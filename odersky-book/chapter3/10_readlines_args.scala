// Run with scala 10_readlines_args.scala 10_readlines_args.scala
import scala.io.Source

val filename = "/Users/robertk/tmp/repeat_val.csv"

if (args.length > 0)
  for (line <- Source.fromFile(args(0)).getLines())
    println(line.length())
else
  Console.err.println("Pass a filename")


import scala.io.Source

val filename = "/Users/robertk/tmp/repeat_val.csv"

for (line <- Source.fromFile(filename).getLines())
  println(line.length())


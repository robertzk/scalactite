import ChecksumAccumulator.calculate

object FallWinterSummerSpring extends App {
  for (season <- List("fall", "winter", "spring", "summer"))
    println(season + ": " + calculate(season))
}


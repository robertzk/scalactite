import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap.+=(1 -> "Booty")
treasureMap += (2 -> "Scurvy")
treasureMap += (3.->("Treasurrre")) // We just call the "->" method

println(treasureMap(2))

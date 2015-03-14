class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc = new ChecksumAccumulator()
acc.add(1.toByte)
acc.add(2.toByte)

acc.checksum // -3 of course

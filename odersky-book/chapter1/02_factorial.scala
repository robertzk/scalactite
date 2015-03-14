def factorial(x: BigInt): BigInt =
  if (x <= 1) 1 else x * factorial(x - 1)

println(factorial(100))

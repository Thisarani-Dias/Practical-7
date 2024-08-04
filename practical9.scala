package q1

object practical9 {

  // 1. filterEvenNumbers function
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  // 2. calculateSquare function
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  // Helper function to check if a number is prime
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else !(2 until n).exists(i => n % i == 0)
  }

  // 3. filterPrime function
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
  }



  def main(Args: Array[String]): Unit = {
    val input1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Even Numbers:")
    println(filterEvenNumbers(input1)) // Output: List(2, 4, 6, 8, 10)

    val input2 = List(1, 2, 3, 4, 5)
    println("Square Numbers:")
    println(calculateSquare(input2)) // Output: List(1, 4, 9, 16, 25)

    println("Prime Numbers:")
    println(filterPrime(input1)) // Output: List(2, 3, 5, 7)
  }

}

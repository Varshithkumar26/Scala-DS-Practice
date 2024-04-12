class nthPrime extends App{

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to (n-1)).exists(x => n % x == 0)
  }

  def nthPrime(n: Int): Int = {
    def findNextPrime(candidate: Int, primesFound: Int): Int = {
      if (primesFound == n) candidate - 1
      else if (isPrime(candidate)) findNextPrime(candidate + 1, primesFound + 1)
      else findNextPrime(candidate + 1, primesFound)
    }

    findNextPrime(2, 0)
  }

}

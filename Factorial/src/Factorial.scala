

/**
 * @author chao
 */
object Factorial {
	def main(args: Array[String]) {
		def Factorial(n: Int): Int = loop(1, n);
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n - 1)
		println(Factorial(5));
	}
}
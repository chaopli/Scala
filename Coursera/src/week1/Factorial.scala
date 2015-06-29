package week1

/**
 * @author chaoli
 */
object Factorial {
		def calc(n: Int): Int = loop(1, n);
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n - 1)
}
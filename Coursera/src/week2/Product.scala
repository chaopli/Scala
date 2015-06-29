package week2

/**
 * @author chaoli
 */
object Product {
  def calc(f: Int => Int) (a: Int, b: Int): Int = 
  	mapReduce(f, (x, y)=>x*y, 1)(a, b)

  def fact(n: Int): Int = 
  	calc(x=>x)(1, n)

  def mapReduce(f: Int=> Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b: Int): Int=
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
}

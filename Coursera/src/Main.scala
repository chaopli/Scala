import week1.Factorial
import week1.Sum
import week2.Product

/**
 * @author chaoli
 */
object Main {
  def main(args: Array[String]) {
  	println(Factorial.calc(10));
  	println(Product.calc(x=>x*x)(3, 4));
  }
}
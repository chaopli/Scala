import week1.Factorial
import week1.Sum
import week2.Product
import week2.lecture2_3

/**
 * @author chaoli
 */
object Main {
  def main(args: Array[String]) {
  	println(Factorial.calc(10));
  	println(Product.calc(x=>x*x)(3, 4));
  	println(lecture2_3.sqrt(2));
  }
}
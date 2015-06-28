object session {
	1 + 3                                     //> res0: Int(4) = 4
	def abs(x: Double) = if (x < 0) -x else x //> abs: (x: Double)Double
	def sqrtIter(guess: Double, x: Double) :Double =
		if (isGoodEnough(guess, x)) guess
		else sqrtIter(improve(guess, x), x)
                                                  //> sqrtIter: (guess: Double, x: Double)Double
		
	def isGoodEnough(guess: Double, x: Double) =
		abs(guess * guess - x) / x < 0.01 //> isGoodEnough: (guess: Double, x: Double)Boolean
		
	def improve(guess: Double, x: Double) =
		(guess + x / guess) / 2           //> improve: (guess: Double, x: Double)Double
		
	def sqrt(x:Double) = sqrtIter(1.0, x)     //> sqrt: (x: Double)Double
	
	sqrt(2)                                   //> res1: Double = 1.4166666666666665
	sqrt(4)                                   //> res2: Double = 2.000609756097561
	sqrt(1e60)                                //> res3: Double = 1.0000788456669446E30
	sqrt(1e-6)                                //> res4: Double = 0.0010005538710539446
}
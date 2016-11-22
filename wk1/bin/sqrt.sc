object sqrt {
  //println("Welcome to the Scala worksheet")

def abs(x:Double) = if (x < 0) -x else x          //> abs: (x: Double)Double

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)             //> sqrtIter: (guess: Double, x: Double)Double

def isGoodEnough(guess: Double, x: Double) =
	abs(guess*guess-x)/x <0.001               //> isGoodEnough: (guess: Double, x: Double)Boolean

def improve(guess: Double, x: Double) =(guess + x / guess) / 2
                                                  //> improve: (guess: Double, x: Double)Double

def sqrt(x: Double) = sqrtIter(1, x)              //> sqrt: (x: Double)Double

sqrt(4)                                           //> res0: Double = 2.000609756097561
sqrt(0.000006)                                    //> res1: Double = 0.0024497049177167546
sqrt(600000000)                                   //> res2: Double = 24495.999735426863
}
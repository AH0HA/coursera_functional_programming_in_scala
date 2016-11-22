object sqrt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 
  //println("Welcome to the Scala worksheet")

def abs(x:Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(124); 

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(75); 

def isGoodEnough(guess: Double, x: Double) =
	abs(guess*guess-x)/x <0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(64); 

def improve(guess: Double, x: Double) =(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(38); 

def sqrt(x: Double) = sqrtIter(1, x);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$0 = 

sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(15); val res$1 = 
sqrt(0.000006);System.out.println("""res1: Double = """ + $show(res$1));$skip(16); val res$2 = 
sqrt(600000000);System.out.println("""res2: Double = """ + $show(res$2))}
}

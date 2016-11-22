object tst1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(27); 
  
  val xs =List(1,2,3,4);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(24); 
  
  xs foreach println}
}

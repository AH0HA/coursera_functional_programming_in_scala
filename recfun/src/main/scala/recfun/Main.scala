package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      
      if (c==0 || r==0 ||c==r) 1 else pascal(c-1,r-1)+pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      
      /*def inner(chars : List[Char]):Int = {
         
         if (chars.isEmpty)( 0 )
           else if (chars.head=='(')( inner(chars.tail)+1 )
           else if (chars.head==')')( inner(chars.tail)-1 )
           else ( inner(chars.tail))
         
      }*/
      
      def inner(c : Char):Int = {
         
         //if (chars.isEmpty)( 0 )
         if (c=='(')( +1 )
           else if (c==')')( -1 )
           else ( 0)
         
      }    
      
      def loop(acc: Int, chars: List[Char]): Int = {
        if (acc < 0||chars.isEmpty) acc
          else loop(acc+inner(chars.head),chars.tail)
      }
      
      if(loop(0,chars)==0) true else false

    }



  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      
      //def cnt(money: Int, coins: List[Int], Length: Int): Int = {
        if (money==0) 1
          else if(money<0) 0
          else if(money>0 && coins.isEmpty)0
          else ( countChange(money,coins.tail)+countChange(money-coins.head,coins))
      //}      
          //    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
    //return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
      /*if(money==0||coins.isEmpty) 0 
        else (
              coins.head
            )*/
      
      //}
    }
  }

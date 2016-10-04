/** ConditionalOperatorSnippet
  * your name here
*/

import java.util.Scanner;

public class ConditionalOperatorSnippet
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );
    
    /* prompt the user for a number. */
    System.out.println( "Enter a number" );
    int number = scan.nextInt( );
    
    /** Is the number odd or even?
        Here is an if/else statement */
    if ( number % 2 == 0 )
    {
      System.out.println( number + " is even." );
    }
    else
    {
      System.out.println( number + " is odd." );
    }
    
    //*****1. write the code for even or odd using the conditional operator */
    
    System.out.println( number +
                      ( number % 2 == 0 ? "is even." : "is odd."));
    
    /****** Uncomment the next section so that you
      * ask the user for a word, then ask for a character. */
  
    System.out.println( "Enter a word" );
    String word = scan.next( );
    System.out.println( "Enter a letter" );
    String letterS = scan.next( );
    char letter = letterS.charAt( 0 );
 
   /*** tell the user whether the character is in the word.
     * Remember that indexOf returns -1 if a character is not found */
    
    /******2.  write the code using if else */
    
    if (word.indexOf(letter) == -1)
      {
         System.out.println(letter + " is not in" + word);
      }
    else
      {
         System.out.println(letter + " is in" + word);
      }
        
    /******3.  write the code using the conditional operator */
    
    System.out.println(letter +
            (word.indexOf(letter) == -1 ? "is not in" : "is in") + word);

    
                       
                       
                       
                       
                       
  } // end main
} // end class
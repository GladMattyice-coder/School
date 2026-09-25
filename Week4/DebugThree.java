//Matison Lund 
// The program will determine the largest of three integers inputted by the user
import java.util.Scanner;

public class DebugThree {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int val1;
      int val2;
      int val3;
      int max;

      System.out.print("Enter integer no. 1: ");
      val1 = scnr.nextInt();

      System.out.print("Enter integer no. 2: ");
      //(Syntax error) Line 18 was originally declaring the data type double , so you have to change the data type to an int in order to work together
      //Code before: val2 = scnr.nextDouble();
      val2 = scnr.nextInt();
      System.out.print("Enter integer no. 3: ");
      val3 = scnr.nextInt();

      // First assume val1 is the largest.
      max = val1;

      //(Logic error) There is a semi colon after the if statement, that ends the statement
      //Code before: if (val2 > max);
      if (val2 > max) {
         max = val2;
      }
      //(Logic error AND Syntax error) Update max if val3 is larger AND there was not an opening bracket for the val3 if statement
      //if val3 is larger than you cant assign that value to the variable val1 (I mean you could but it doesnt make sense)
      //Code before: max = val1; AND if (val3 > max) (missing bracket)
      //
      if (val3 > max) {
         max = val3;
      }
      //(Both Syntax errors) Line 37 had a bracket and it was keeping the print statement from exisiting AND the Print.ln statement was incorrect 
      //Code before: if(val3 > max) max = val3; }
      System.out.println("Max of [" + val1 + ", " + val2 + ", " + val3 + "] is " + max);
 
   }
}
   

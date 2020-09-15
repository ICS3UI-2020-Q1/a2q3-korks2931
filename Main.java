import java.util.Scanner;
/**
 * This program shows the correct order for for two numbers the user enters
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner (System.in);
     //declare a variable to store the first numbers
     System.out.println("Please enter an integer:");
     // prompt the user for the first number 
     int A = input.nextInt();
     //declare a variable to store second number
     //prompt the user for the second number
     
     System.out.println ("Please enter another integer:");
     int B = input.nextInt();
     // find the order for the numbers 
     if( A >= B ){
       System.out.println("Your numbers in ascending order are " + B + "," + A);

     }else{
       // write the different order
       System.out.println("Your numbers in ascending order are " + A + ","+ B);
     }

  }
}

import java.util.Random;
import java.util.Scanner;

/**
* The RandomNumGenExtra program implements an application that generates a random 
* number based on the inputed max and min values.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-01 
*/

public class RandomNumGenExtra {
  // Create variables 
  static int randomizedNum;
  static int maxValueInput;
  static int minValueInput;

  
  /**
   * Generates a random number.
   */
  
  
  public static void rollDie(int minValue, int maxValue) {
    Random randomizer = new Random();
    // Generate random number 1-maxValue
    randomizedNum = (randomizer.nextInt(maxValue - minValue + 1)) + minValue;
    // Prints the random number
    System.out.println(randomizedNum);
  }
  
  /**
  * Calculates and checks if the users input is the same as the guess.
  */
  
  public static void main(String[] args) {
    // Create scanner and randomizer
    Scanner userInput = new Scanner(System.in);
    // Ask for input
    System.out.println("Input the max value.");
    try {
      maxValueInput = Integer.parseInt(userInput.nextLine());
      // Ask for input
      System.out.println("Input the min value.");
      minValueInput = Integer.parseInt(userInput.nextLine());
      // Calls the function
      rollDie(minValueInput, maxValueInput);
    } catch (Exception e) {
      // Informs the user that their input is invalid
      System.out.println("Invalid Input.");
    }
  }
}
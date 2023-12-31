import java.util.Scanner;

/*
Class: CMSC203 CRN 23239
Assignment #: Assignment_1
Instructor: FARNAZ EIVAZI
Description: I took c++ in CMSC140 in 2019 and now i am taking CMSC203 which is based on Java Program
Due Date: 09/11/2023 
Platform/Compiler: Window (Eclipse)
I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Student’s Name: ALASSANE KONE
*/

public class ESPGame {

	public static void main(String[] args) {
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Describe yourself: ");
	    String description = scanner.nextLine();
	    System.out.println("Due date: ");
	    String date = scanner.nextLine();
	    System.out.println("CMSC203 Assigment1: Test your ESP skills!");
	    int correctGuesses = 0;
	    int round =  1;
	    String[] colors = {COLOR_RED, COLOR_GREEN, COLOR_BLUE, COLOR_ORANGE, COLOR_YELLOW};
	    System.out.println("Round"+" "+round);
	    /*
	     * This is like the Introduction in the Body of my program, which means check the condition 1 by 1 to see if it's True 
	     * and then, program will ask/prompt the user to Enter a Guess
	     */
	    
	    for (int i = 0; i < 9; i++) {
	          int randomNumber = (int) (Math.random() * colors.length);
	          String randColor = colors[randomNumber];
	          round++;
	          System.out.println();
	          System.out.println("I am thinking of a color.");
	          System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
	          System.out.println("Enter your guess: ");
	         String clientGuess;
	         
	         /*
	          * If the Case you enter match with a color listed here, then the program will save in the scanner, Break the "While statement" 
	          * and jump to the next "if statement"
	          * But if the you enter a color that don't match with a color listed, then the program will take you 
	          * to the "Else statement" by asking you to Re-enter a Correct color that matches with the color listed.
	          * When your 2nd Answer/Guess is GOOD...
	          * then the Program continue and it will tell you if your Answer match with the Computer Answer/color
	          */
	          while (true){
	              clientGuess = scanner.nextLine();
	              if (clientGuess.equalsIgnoreCase(COLOR_RED) || clientGuess.equalsIgnoreCase(COLOR_BLUE) ||
	                      clientGuess.equalsIgnoreCase(COLOR_YELLOW) || clientGuess.equalsIgnoreCase(COLOR_GREEN) || clientGuess.equalsIgnoreCase(COLOR_ORANGE)){
	                  break;
	              }
	              else {
	                  System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
	                  System.out.println("Enter your guess again: ");
	              }
	          }
	          if (clientGuess.equalsIgnoreCase(randColor)) {
	              correctGuesses++;
	          }
	          System.out.println("I was thinking of  " + randColor);
	          System.out.println("Round"+" "+round); 
	      }
	     
	    	 
	    	 
	     
	     
	     /*
	      * In case if the number of round reach a maximum of 10, it will take you to this Conclusion by giving you the Result of the Game, 
	      * your Information
	     */
	      System.out.println("Game over \n");
	      System.out.println("You guessed "  +correctGuesses + " out of 10 colors correctly.");
	      System.out.println("Name: " + name);
	      System.out.println("Description: " + description);
	      System.out.println("Due date: " + date);
	      scanner.close();
	}

}

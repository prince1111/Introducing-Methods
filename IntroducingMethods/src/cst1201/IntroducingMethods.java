package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: anualli.
 */
public class IntroducingMethods {

	
    public static void main(String[] args) {
            
            // scan the input string for the length of words typed
        Scanner sc = new Scanner(System.in);
        String input = getInputString(sc);
        int length = input.length();

        // If user types nothing ; Print an error message 
        // if use types 1 letter or more : Print the amount in lengths and include the first word.
        if (length == 0) {
            System.out.print("ERROR - string must not be empty.");
        } else {

            System.out.println("Your string has " + getWordCount(input) + " words in it.");

            System.out.println("First word: " + getFirstWord(input));
        }

    }

    /**
     *
     */
    private static String getInputString(Scanner inScanner) {

         // ASk user for string. 
        System.out.println("Enter a string: ");
        String input = inScanner.nextLine();
        return input;
        //  Scanner is not declared in the body of this method.
    }

    /**
     *
     *
     *
     */
    private static int getWordCount(String input) {
        int spaceCount = 1;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        return spaceCount;

    }

    private static String getFirstWord(String input) {
        int firstSpace = 1;
        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                firstSpace = i;
                break;
            }
        }
        String firstWord = input.substring(0, firstSpace);

        return firstWord;
    }
}

        
            
            
        


		
package cst1201;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * TODO: Description of your class.
 *
 * @author TODO: Your name here.
 */
public class IntroducingMethods {

	public static void main(String[] args) {
		//get inputFromUser from the user.
		Scanner scanner = new Scanner(System.in);
		String inputFromUser = getInputString(scanner);

		//get the number of words in the string.
		int count = getWordCount(inputFromUser);
		System.out.println("Your string has " + count + " words in it.");

		//get the first word.
		String firstWord = getFirstWord(inputFromUser);
		System.out.println("The first word is: " + firstWord);
	}

	/**
	 * Given a Scanner, prompts the user for a String. If the user enters an
	 * empty String, reports an error message and asks for a non-empty
	 * String. Returns the String to the calling program.
	 *
	 * @param inScanner The Scanner to use to prompt the user.
	 * @return The resulting String from the user.
	 */
	public static String getInputString(Scanner inScanner) {
		//prompt the user for a string.
		System.out.print("Enter a string: ");
		String ret = inScanner.nextLine();

		//while the string is empty.
		while (ret.isEmpty()) {
			//report an error message.
			System.err.println("ERROR - string must not be empty.");

			//Prompt the user for a string.
			System.out.print("Enter a string: ");
			ret = inScanner.nextLine();
		}

		//at this point, we have a non-empty string. Return it.
		return ret;
	}

	/**
	 * Given a String, returns the number of words in the String. A word is
	 * a sequence of characters with no spaces. For example, the method
	 * call:
	 * <pre>
	 *      int count = getWordCount("The quick brown fox jumped");
	 * </pre> results in count having a value of 5. This method should be
	 * called from the main method. For this assignment, you may assume that
	 * words will be separated by exactly one space.
	 *
	 * @param input The String in question.
	 * @return The number of words in the String. Each word is separated by
	 * a single space.
	 */
	public static int getWordCount(String input) {
		//For this assignment, we can assume that a single space separates words.
		//As such, we can simply return 1 + the number of spaces, as long
		//as the string is non-empty.

		if (input.isEmpty())
			return 0; //no words in an empty string.
		else {
			//first, convert the string to a stream of characters.
			IntStream charStream = input.chars();

			//next, filter the stream to only space characters.
			IntStream onlySpaces = charStream.filter(Character::isSpaceChar);

			//return the count of characters in the stream plus 1.
			return (int) onlySpaces.count() + 1;
		}
	}

	/**
	 * Given a string, returns the first "word" in the string as defined in
	 * exercise #1. If the string is empty, the empty string is returned.
	 *
	 * @param input The string in question.
	 * @return The first "word" in input, as defined by exercise #1, or
	 * empty string if input is empty.
	 */
	public static String getFirstWord(String input) {
		if (input.isEmpty())
			return input; //input is empty.
		else {
			//find the position of the first space in input.
			int pos = input.indexOf(' ');

			//if there are no spaces, then there is only one word.
			if (pos == -1)
				return input; //the only word is the first word.

			//return a substring from [0,pos).
			return input.substring(0, pos);
		}
	}
}

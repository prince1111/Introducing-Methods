package cst1201;

import java.util.Scanner;
import java.util.StringTokenizer;

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

		//get the first word if it exists.
		String firstWord = getFirstWord(inputFromUser);

		if (!firstWord.isEmpty())
			System.out.println("The first word is: " + firstWord);

		//get the nth word if it exists.
		System.out.print("Enter the number of the word to retrieve: ");
		int n = scanner.nextInt();

		String nthWord = getWord(inputFromUser, n);

		if (nthWord.isEmpty())
			System.err.println("That word does not exist.");
		else
			System.out.println("The word is: " + nthWord);
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
		//break the string into "tokens" separated by space. Each of
		//these tokens will be a word.
		StringTokenizer st = new StringTokenizer(input, " ");
		
		//return the count of words.
		return st.countTokens();
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
		StringTokenizer st = new StringTokenizer(input, " ");

		//if we have at least one word.
		if (st.hasMoreTokens())
			//return the first word.
			return st.nextToken();
		else //otherwise.
			//return the empty string.
			return "";
	}

	/**
	 * Returns the nth word in input. If it doesn't exist, empty string is
	 * returned.
	 *
	 * @param input The string in question.
	 * @param n The index of the word the retrieve starting from 0.
	 * @return The nth word input if it exists and empty string otherwise.
	 */
	public static String getWord(String input, int n) {
		StringTokenizer st = new StringTokenizer(input, " ");
		int curr = 0; //the current index

		//while there are more words.
		while (st.hasMoreTokens()) {
			//get the next word.
			String word = st.nextToken();
			
			//if the current index is at the desired index.
			if (curr == n)
				//return the current word.
				return word;
			else //otherwise.
				//keep going.
				curr++;
		}

		//if we are here, we must have been out-of-bounds.
		return "";
	}
}

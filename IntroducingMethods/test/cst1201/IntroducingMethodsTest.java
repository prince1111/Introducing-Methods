package cst1201;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raffi
 */
public class IntroducingMethodsTest {

	public IntroducingMethodsTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of getInputString method, of class IntroducingMethods.
	 */
	@Test
	public void testGetInputString() {
		System.out.println("getInputString");
		
		String input = "\n\nthe quick brown fox jumped\n";
		Scanner inScanner = new Scanner(input);
		
		String expResult = "the quick brown fox jumped";
		String result = IntroducingMethods.getInputString(inScanner);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getWordCount method, of class IntroducingMethods.
	 */
	@Test
	public void testGetWordCount() {
		System.out.println("getWordCount");
		String input = "";
		int expResult = 0;
		int result = IntroducingMethods.getWordCount(input);
		assertEquals(expResult, result);
		
		input = "the quick brown fox jumped";
		expResult = 5;
		result = IntroducingMethods.getWordCount(input);
		assertEquals(expResult, result);
		
		input = "A man, a plan, a canal; Panama";
		expResult = 7;
		result = IntroducingMethods.getWordCount(input);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getFirstWord method, of class IntroducingMethods.
	 */
	@Test
	public void testGetFirstWord() {
		System.out.println("getFirstWord");
		String input = "";
		String expResult = input;		
		String result = IntroducingMethods.getFirstWord(input);
		assertEquals(expResult, result);
		
		input = "the quick brown fox jumped";
		expResult = "the";
		result = IntroducingMethods.getFirstWord(input);
		assertEquals(expResult, result);
		
		input = "One";
		expResult = input;
		result = IntroducingMethods.getFirstWord(input);
		assertEquals(expResult, result);
		
		input = "O";
		expResult = input;
		result = IntroducingMethods.getFirstWord(input);
		assertEquals(expResult, result);
	}

}

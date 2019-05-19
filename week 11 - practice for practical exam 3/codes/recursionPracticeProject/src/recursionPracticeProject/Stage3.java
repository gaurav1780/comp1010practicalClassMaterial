package recursionPracticeProject;

public class Stage3 {
	/**
	 * 
	 * @param str
	 * @return the reverse of the string
	 */
	public static String reverse(String str) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if string is a palindrome (same when reversed), false otherwise
	 */
	public static boolean isPalindrome(String str) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param pattern
	 * @param replacement
	 * @return a modified version of str where all occurrences of pattern
	 * are replaced by replacement
	 * 
	 * For example,
	 * replaceAll("this is better than the other thing", "th", "sup") 
	 * returns the String "supis is better supan supe osuper suping"
	 * 
	 */
	public static String replaceAll(String str, String pattern, String replacement) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param d: single digit integer
	 * @return the number of occurrences of digit d in integer n, 
	 * except that a d with another d immediately to its left counts double, 
	 * For example, 
	 * 
	 * if countWeighted(8818, 8) returns 4. 
	 * 
	 * Explanation:
	 * 
	 * First 8 (from left) contributes 1
	 * Second 8 contributes 2 (since there is another 8 immediately to its left)
	 * Third 8 contributes 1
	 * 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
	 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 */
	public static int countWeighted(int n, int d) {
		return 0; //to be completed
	}
	
	@SuppressWarnings("unused")
	private static String[] morseCodes = {"-","-...","-.-.","-..",".",
							"..-.","--.","....","..",".---",
							"-.-",".-..","--","-.","---",
							".--.","--.-",".-.","...","-",
							"..-","...-",".--","-..-",
							"-.--","--.."};
	
	/**
	 * NOT SURE ABOUT THIS ONE - THOUGHT IT MIGHT BE INTERESTING!
	 * @param message
	 * @return a String containing morse code for message passed.
	 * IMPORTANT lookup array provided as static variable morseCodes
	 * Use / as a space
	 * Use space to separate morse codes for two letters
	 * For example, 
	 * if message = "nice one", return "-. .. -.-. . / --- -. . "
	 */
	public static String getMorse(String message) {
		//morseCodes[i] gives the equivalent morse code for letter (char)('a' + i)
		//'b' -> morseCodes[1]
		//'k' ('a' + 10) -> morseCodes[10]
		return null; //to be completed		
	}
}

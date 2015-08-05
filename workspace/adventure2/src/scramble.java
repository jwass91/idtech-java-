import java.util.ArrayList;
import java.util.Scanner;

/**
 *  This program finds words in strings of letters that
 *  are input by the user.  The program has a built-in word
 *  list of 63933 words.  It finds all words that can be
 *  made by selecting letters from the user's input string,
 *  in any order.  The program repeats this process until
 *  the user inputs a blank line.
 */
public class scramble {

	/**
	 * A variable to hold the list of words.  This ArrayList is filled
	 * by the method readWordList(), which is called at the start of
	 * the main() routine.  Note that all the words in the list are
	 * in strictly lower case, and they are in alphabetical order.
	 */
	private static String[] wordList;
	

	/**
	 * The program main's routine reads strings of letters from the
	 * user and finds all words that can be made from letters selected
	 * from the input.
	 */
	public static void main(String[] args) {
		
		readWordList();  // Reads words into an ArrayList, wordList.
		
		Scanner in = new Scanner(System.in);

		while (true) {
			
			// Get a non-empty string of letters from user; convert to lower case.
			
			System.out.println();
	        System.out.print("Enter some letters (a-z only!):  ? ");
	        String text = in.nextLine().trim().toLowerCase();
	        if (text.length() == 0)
	        	break; // Exit when input string is blank.
	        if ( ! lettersOnly(text) ) {
        		System.out.println("I said, only letters!");
	        	continue;
	        }
	        System.out.println();
	        
	        System.out.println("Looking for words in " + text);
	        
	        // Call recursive method to find all words in text.
	        
		}
	} // end main()

	
	/**
	 * Tests whether a given string is one of the words in wordList.
	 * @param word  The string of letters to be tested.
	 * @return true if word is in the list of words, false if not.
	 */
	public static boolean wordExists(String word) {
		    // Search for word in wordList using LINEAR SEARCH.
		for (String w : wordList)
			if (w.equals(word))
				return true;
		return false;
	}
	
	
	/**
	 * A utility routine, used in the main program, to test
	 * whether all the characters in a string are letters.
	 * @param str The string to be tested.
	 * @return true if the all characters in str are letters, false if not.
	 */
	private static boolean lettersOnly(String str) {
		for (int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	   if (ch < 'a' || ch > 'z')
        		   return false;
		}
		return true;
	}
	
	
	/**
	 * Reads the list of words from a resource file into the ArrayList,
	 * wordList.  The list of words must be in a resource file named
	 * wordlist.txt in a directory named resources.  This method will
	 * throw an exception if the resource file cannot be found.
	 */
	private static void readWordList() {
		ArrayList<String> words = new ArrayList<String>();
		ClassLoader cl = scramble.class.getClassLoader();
		Scanner fileIn = new Scanner(cl.getResourceAsStream("resources/wordlist.txt"));
		while (fileIn.hasNext()) {
			String word = fileIn.next();
			words.add(word);
		}
		wordList = new String[words.size()];
		words.toArray(wordList);
	}
	
	
} // end class Scramble
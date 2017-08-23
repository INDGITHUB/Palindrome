package palindrome;

/**
 * Palindrome is a word that is exactly similar to its reversed type
 * This class shows actions related to palindrome and practice interfaces
 * In demonstrating the interfaces, this class will act as the client who
 * implements the interface
 * 
 * @author indika
 */
public class PalindromeClient2  extends PalindromeClient1 implements PalindromeInterface {

	private String word = "";
	private String reverseWord = "";
	private boolean isAPalindrome = false;
	
	protected int number = 5;

	public PalindromeClient2(String word) {
		this.word = word.toLowerCase(); // Make all letters to lower case rather than use it twice
	}

	/* Returns the original(input) word */
	public String getWord() {
		return word;
	}

	/* Returns the reversed word */
	public String getReverseWord() {
		reverseWord = new StringBuilder(word).reverse().toString(); // There are other ways with loops and String class
		return reverseWord;
	}
	
	/* Returns the status whether its a palindrome */
	public boolean getIsAPalindrome() {
		isAPalindrome = word.equals(getReverseWord());
		return isAPalindrome;
	}

	@Override
	/* Implementation of method in the interface  */
	public int howManyLetters() {
		System.out.println("I am doing this a harder way");
		return new StringBuilder(word).length() + 1;
	}
}

package palindrome;
/**
 * @author indika
 * To check whether a given word is a palindrome 
 */
public class PalindomeTester {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {

		PalindromeClient1 palindromeTest1 = new PalindromeClient1("racecar");
		PalindromeClient2 palindromeTest2 = new PalindromeClient2("racecar");
		PalindromeInterface[] palindromeTest3 = new PalindromeInterface[2];


		System.out.println("Client 1 ");
		System.out.println("Number in Client 1 is " + palindromeTest2.number);

		System.out.println("There are " + palindromeTest1.howManyLetters() + " letters in your input word");
		System.out.println("The palindrome test on your word " + "\"" + palindromeTest1.getWord() + "\"" + " is " + palindromeTest2.getIsAPalindrome());

		System.out.println();
		System.out.println("Client 2 ");
		System.out.println("Number in Client 2 is " + palindromeTest2.number);
		System.out.println("Number after casting is " + palindromeTest2.number);

		System.out.println("There are " + palindromeTest2.howManyLetters() + " letters in your input word");
		System.out.println("The palindrome test on your word " + "\"" + palindromeTest2.getWord() + "\"" + " is " + palindromeTest2.getIsAPalindrome());
		System.out.println("The formula for the area is : \u03C0ab");
	}

}

import java.util.Scanner;

/**
 *This program demonstrates the usage of the following String functions: 
 *s.length()
 *s.equals()
 *s.substring()
 *s.trim()
 *s.indexOf()
 *s.lastIndexOf()
 *s.charAt()
 *
 *The two other string functions I chose to include are s.toUpperCase() and s.replace().
 *s.toUpperCase() converts the string you included to all uppercase characters.
 *s.replace() requires two characters as a parameter and swaps those characters in the included string. 
 *
 * @author Cody Rowland
 * @version 1.8.0_181
 */

public class StringFun{

	public static void main(String[] args){

		//Declaring an object as the scanner variable.
		Scanner scan = new Scanner(System.in);

		//Prompts user on input.
		System.out.println("\nEnter a string followed by the enter button.");

		//Setting String variables equal to user input on following lines. 
		String s = scan.nextLine();

		//Prompts user on input.
		System.out.println("\nEnter a string followed by the enter button.");

		String otherString = scan.nextLine();

		//Prompts user on input.
		System.out.println("\nEnter a string followed by the enter button.");

		String subString = scan.nextLine();
		System.out.println("\n");

		//String functions as labeled on the assignment sheet. 
		System.out.println("The length of the first string is " + s.length());
		System.out.println("The first string does not equal the second therefore it is " + s.equals(otherString));
		System.out.println("The subString from 0-8 is " + s.substring(0,8));
		System.out.println("The first string trimmed: " + s.trim());
		System.out.println("The position of the letter 'C' in the string: " + s.indexOf('C'));
		System.out.println("The last position of the letter 'i' in the string: " + s.lastIndexOf('i'));
		System.out.println("The 5th character of the first string is " + s.charAt(5));

		//Converts the string given to all uppercase characters.
		System.out.println("The first string converted to uppercase: " + s.toUpperCase());
		//Takes two charcaters as parameters and swaps them in the string given.
		System.out.println("The first string with the letter 'l' replaced with 'y': " + s.replace('l', 'y'));
	}
}
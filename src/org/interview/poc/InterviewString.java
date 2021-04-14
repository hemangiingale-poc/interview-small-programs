package org.interview.poc;

/**
 * @author hemangi
 *
 */
public class InterviewString {

	public static void main(String[] args) {
		String reverseString = "";

		// Method to reverse String Using For Loop
		reverseString = InterviewString.reverseStringUsingForLoop("for");

		// Method to reverse String Using While Loop
		reverseString = InterviewString.reverseStringUsingWhileLoop("while");

		// Method to reverse String Using Do While Loop
		reverseString = InterviewString.reverseStringUsingDoWhileLoop("DoWhileLoop");

		// Method to reverse String Using StringBuffer
		reverseString = InterviewString.reverseStringUsingStringBuffer("StringBuffer");
		// Method to reverse String Using StringBuilder
		reverseString = InterviewString.reverseStringUsingStringBuilder("StringBuilder");

		// Method to reverse String Using StringBuilder using append method
		reverseString = InterviewString.reverseStringUsingStringBuilderusingAppendMethod("StringBuilder");

		// Print reverse string
		System.out.println(reverseString);
	}

	private static String reverseStringUsingStringBuilderusingAppendMethod(String name) {
		// TODO Auto-generated method stub
		return new StringBuilder().append(name).reverse().toString();
	}

	private static String reverseStringUsingStringBuilder(String name) {
		return new StringBuilder(name).reverse().toString();
	}

	private static String reverseStringUsingStringBuffer(String name) {
		return new StringBuffer(name).reverse().toString();
	}

	private static String reverseStringUsingDoWhileLoop(String name) {
		String reverseName = "";
		int i = name.length() - 1;
		do {
			reverseName = reverseName + name.charAt(i);
			i--;
		} while (i >= 0);
		return reverseName;
	}

	public static String reverseStringUsingWhileLoop(String name) {
		String reverseName = "";
		int i = name.length() - 1;
		while (i >= 0) {
			reverseName = reverseName + name.charAt(i);
			i--;
		}
		return reverseName;
	}

	public static String reverseStringUsingForLoop(String abc) {
		String pqr = "";
		for (int i = abc.length() - 1; i >= 0; i--) {
			pqr = pqr + abc.charAt(i);
		}
		return pqr;
	}

}

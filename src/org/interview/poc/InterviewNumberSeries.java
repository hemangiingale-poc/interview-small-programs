/**
 * 
 */
package org.interview.poc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hemangi
 *
 */
public class InterviewNumberSeries {

	public static void main(String[] args) {
		// InterviewNumberSeries.fibonancciSeriesUsingforLoop(0, 1, 10);
		// InterviewNumberSeries.fibonancciSeriesUptoGivenNumber(0, 1, 10);
		// InterviewNumberSeries.fibonancciSeriesUsingWhileLoop(0, 1, 10);
		// InterviewNumberSeries.checkNumberIsPrimeOrNot(7,true);
		// InterviewNumberSeries.printPrimeNumberSeries(100);
		// InterviewNumberSeries.checkNumberIsPalindromOrNot(121);
		// InterviewNumberSeries.checkNumberIsArmstrongOrNot(370);
		// InterviewNumberSeries.swappingNumbersWithoutUsingThirdVariable(12,65);
		// InterviewNumberSeries.swappingNumbersUsingThirdVariable(12, 65);
		InterviewNumberSeries.findLargestNumber();
		
	}

//=======================================Fibonancci Series==========================================//

	// fibinancii series using for loop
	public static void fibonancciSeriesUsingForLoop(int num1, int num2, int count) {
		System.out.print(num1 + " " + num2);
		for (int i = 0; i < count; i++) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);

		}
	}

	// fibinancii series instesd of terms(upto ... term)
	public static void fibonancciSeriesUptoGivenNumber(int num1, int num2, int givneNumber) {
		System.out.print(num1 + " " + num2);
		int num3 = 0;
		for (int i = 0; num3 < givneNumber; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 < givneNumber) {
				System.out.print(" " + num3);
			}

			else {
				System.out.print(" else " + num3);

			}

		}
	}

	// fibinancii series using while loop

	public static void fibonancciSeriesUsingWhileLoop(int num1, int num2, int count) {
		int i = 1;
		System.out.print(num1 + " " + num2);

		while (i <= count) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
			i++;
		}
		System.out.println("");

	}

//===============================================Prime Number========================================//

	public static Boolean checkNumberIsPrimeOrNot(int num, Boolean isPrintResult) {
		int count = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			String result = (count == 2) ? (num + " is Prime Number") : (num + " is not Prime Number");
			if (isPrintResult) {
				System.out.println(result);
			}

			return (count == 2);
		} else {
			System.out.println(num + " is Not Prime Number as it is negative number");
		}
		return false;
	}

	// print series of prime number
	public static void printPrimeNumberSeries(int upperNumber) {
		List<Integer> primeNumberSeries = new ArrayList<>();
		for (int i = 1; i <= upperNumber; i++) {

			if (checkNumberIsPrimeOrNot(i, false)) {
				primeNumberSeries.add(i);
			}
		}
		System.out.println(primeNumberSeries);

	}

//============================================Pallindrom Number====================================//

	private static void checkNumberIsPalindromOrNot(int inputNumber) {
		int tempNumber, reminder, reverseNumber = 0;
		tempNumber = inputNumber;
		while (tempNumber != 0) {
			reminder = tempNumber % 10;
			reverseNumber = (reverseNumber * 10) + reminder;
			tempNumber = tempNumber / 10;
		}
		String result = (inputNumber == reverseNumber) ? (inputNumber + " is pallindrom number")
				: (inputNumber + " is not pallindrom number");
		System.out.println(result);
	}

//=======================================Armstrong Number==========================================//	

	private static void checkNumberIsArmstrongOrNot(int inputNumber) {
		int tempNumber, reminder, sum = 0;
		tempNumber = inputNumber;
		while (tempNumber > 0) {
			reminder = tempNumber % 10;
			sum = sum + (reminder * reminder * reminder);
			tempNumber = tempNumber / 10;
		}
		String result = (inputNumber == sum) ? (inputNumber + " is Armstrong number")
				: (inputNumber + " is not Armstrong number");
		System.out.println(result);
	}
//=====================================Swapping two numbers===========================================//

	// swapping Numbers Without Using Third Variable
	private static void swappingNumbersWithoutUsingThirdVariable(int inputNumber1, int inputNumber2) {

		System.out.println("Before swapping the number : " + inputNumber1 + " " + inputNumber2);
		inputNumber1 = inputNumber1 + inputNumber2;
		inputNumber2 = inputNumber1 - inputNumber2;
		inputNumber1 = inputNumber1 - inputNumber2;
		System.out.println("After swapping the number : " + inputNumber1 + " " + inputNumber2);

	}

	//// swapping Numbers Using Third Variable
	private static void swappingNumbersUsingThirdVariable(int inputNumber1, int inputNumber2) {
		System.out.println("Before swapping the number : " + inputNumber1 + " " + inputNumber2);
		int tempNumber = inputNumber1;
		inputNumber1 = inputNumber2;
		inputNumber2 = tempNumber;
		System.out.println("After swapping the number : " + inputNumber1 + " " + inputNumber2);

	}
//=======================================Largest number===============================================//

	private static void findLargestNumber() {
		int numberArray[] = { 78, 65, 86, 90, 143, 20 };
		int largestNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > largestNumber) {
				largestNumber = numberArray[i];
			}
		}
		System.out.println("Largest number in the array is : " + largestNumber);
	}
	
	
}

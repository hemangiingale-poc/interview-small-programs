package org.interview.poc;

/**
 * @author hemangi
 *
 */

import java.util.Scanner;

public class InterviewConditionalStatement {

	public static void main(String[] args) {
		// InterviewConditionalStatement.findGreatetNumber();
		// InterviewConditionalStatement.findNumberOfDaysInMonth();
		// InterviewConditionalStatement.displayNameOfWeekday(8);
		InterviewConditionalStatement.identifyVowelsAndConsonant();

	}

	public static void findGreatetNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println("Greatest number is : " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("Greatest number is : " + number2);
		} else {
			System.out.println("Greatest number is : " + number3);
		}
	}

	private static void findNumberOfDaysInMonth() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month : ");
		int month = sc.nextInt();
		System.out.println("Enter the year : ");
		int year = sc.nextInt();

		int numberOfDaysInMonth = 0;
		String monthNane = "";

		switch (month) {
		case 1:
			monthNane = "January";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			monthNane = "Feburay";
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 3:
			monthNane = "March";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			monthNane = "April";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			monthNane = "May";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			monthNane = "June";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			monthNane = "Jully";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			monthNane = "Aguest";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			monthNane = "September";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			monthNane = "October";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			monthNane = "November";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			monthNane = "December";
			numberOfDaysInMonth = 31;
			break;
		}
		System.out.println(monthNane + " " + year + " has " + numberOfDaysInMonth + " days");
	}

	private static void displayNameOfWeekday(int numberOfDay) {
		String nameOfDay = "";
		switch (numberOfDay) {
		case 1:
			nameOfDay = "Monday";
			break;
		case 2:
			nameOfDay = "Tuesday";
			break;

		case 3:
			nameOfDay = "Wenesday";
			break;

		case 4:
			nameOfDay = "Thursday";
			break;
		case 5:
			nameOfDay = "Friday";
			break;

		case 6:
			nameOfDay = "Saturday";
			break;
		case 7:
			nameOfDay = "Sunday";
			break;
		case 8:
			// System.out.println("Error... Enter the number of day between 1 to 7");
			System.out.println("Error..... Enter number of day between 1 to 7");
			break;

		}
		System.out.println("The name of day is : " + nameOfDay);
	}

	private static void identifyVowelsAndConsonant() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet : ");
		String alphabet = sc.next();
		if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o")
				|| alphabet.equals("u") || alphabet.equals("A") || alphabet.equals("E") || alphabet.equals("I")
				|| alphabet.equals("O") || alphabet.equals("U")) {
			System.out.println(alphabet + " is vowel");
		} else {
			System.out.println(alphabet + " is consonant");
		}

	}

}

package org.interview.poc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hemangi
 *
 */

public class InterviewArrayPrograms {
	public static void main(String[] args) {
		int[] numberArray = { 123, 345, 90, 68, 234, 50 };
		int[] numberArray1 = { 40, 90, 123, 78, 34, 55 };
		String[] stringArray = { "java", "python", "c#", "c++", "sql" };
		String[] stringArray1 = { "python", "react", "mysql", "springboot", "angular" };
		// InterviewArrayPrograms.sortNumericAndStringArray(numberArray, stringArray);
		// InterviewArrayPrograms.SumofAllArrayElements(numberArray);
		// InterviewArrayPrograms.findIndexOfArrayElements(numberArray, 68);
		// InterviewArrayPrograms.removeSpecificElementFromArray(numberArray, 68);
		// InterviewArrayPrograms.findHighestNumberInArray(numberArray);
		// InterviewArrayPrograms.findSecondHighestNumberInArray(numberArray);
		InterviewArrayPrograms.findCommonElementBetweenTwoArrayArray(numberArray, numberArray1);

	}

	private static void sortNumericAndStringArray(int[] numberArray, String[] stringArray) {
		System.out.println("Original numeric array is : " + Arrays.toString(numberArray));
		Arrays.sort(numberArray);
		System.out.println("Sorting numeric array is : " + Arrays.toString(numberArray));
		System.out.println("Original String array is : " + Arrays.toString(stringArray));
		Arrays.sort(stringArray);
		System.out.println("Sorting string array is : " + Arrays.toString(stringArray));
	}

	private static void SumofAllArrayElements(int[] numericarray) {
		int length = numericarray.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + numericarray[i];
		}
		System.out.println("the sum of all array element is : " + sum);
	}

	private static void findIndexOfArrayElements(int[] numericArray, int arrayElement) {
		int index = 0;
		for (int i = 0; i < numericArray.length; i++) {
			if (numericArray[i] == arrayElement) {
				index = i;
				System.out.println("index of " + arrayElement + " is : " + index);
			}
		}
	}

	private static void removeSpecificElementFromArray(int[] numericArray, int arrayElement) {
		System.out.println("Original array elements are : " + Arrays.toString(numericArray));

	}

	private static void findHighestNumberInArray(int[] numberArray) {
		System.out.println("The Original Array Elements are : " + Arrays.toString(numberArray));
		int highestNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > highestNumber) {
				highestNumber = numberArray[i];
				System.out.println("Highest Number in array is : " + numberArray[i]);
			}
		}

	}

	private static void findSecondHighestNumberInArray(int[] numberArray) {
		System.out.println("The Original Array Elements are : " + Arrays.toString(numberArray));
		int highestNumber = numberArray[0];
		int secondHighestNumber = numberArray[0];
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > highestNumber) {
				highestNumber = numberArray[i];
			} else if (numberArray[i] > secondHighestNumber) {
				secondHighestNumber = numberArray[i];
				System.out.println(" Second Highest Number in array is : " + numberArray[i]);
			}
		}
	}

	private static void findCommonElementBetweenTwoArrayArray(int[] numberArray, int[] numberArray1) {
		System.out.println("The Original Array Elements are : " + Arrays.toString(numberArray));
		System.out.println("The Original Array Elements are : " + Arrays.toString(numberArray1));
		ArrayList<Integer> commonElement = new ArrayList<Integer>();

		for (int i = 0; i < numberArray.length; i++) {
			for (int j = 0; j < numberArray1.length; j++) {
				if (numberArray[i] == numberArray1[j]) {
					commonElement.add(numberArray[i]);
				}
			}
		}
		System.out.print(" Common element between two arrays are : " + commonElement);
	}
}

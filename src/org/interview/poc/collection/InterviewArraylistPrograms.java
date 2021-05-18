package org.interview.poc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author hemangi
 *
 */

public class InterviewArraylistPrograms {
	public static void main(String[] args) {
		// InterviewArraylistPrograms.createArraylist();
		// InterviewArraylistPrograms.iterateArrayList();
		// InterviewArraylistPrograms.addingElementToFirstPosition();
		// InterviewArraylistPrograms.updateRetriveAndREmoveElementFronArrayList();
		// InterviewArraylistPrograms.searchElementInArrayList();
		// InterviewArraylistPrograms.sortArrayList();
		// InterviewArraylistPrograms.copyOneArrayListToAnother();
		// InterviewArraylistPrograms.cloneArrayList();
		// InterviewArraylistPrograms.shuffleANdListElementInArrayList();
		// InterviewArraylistPrograms.compareTwoArrayList();
		// InterviewArraylistPrograms.swapTwoElementInArrayList();
		// InterviewArraylistPrograms.joinTwoArrayList();
		//InterviewArraylistPrograms.RemoveAllElementInArrayListAndCheck();
		InterviewArraylistPrograms.trimCapacityOfArrayList();

	}

	public static void createArraylist() {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Color list : " + color);
	}

	private static void iterateArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Color list : " + color);
		for (String str : color)
			System.out.println(str);
	}

	private static void addingElementToFirstPosition() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		color.set(0, "Pink");
		System.out.println("Color list : " + color);
	}

	private static void updateRetriveAndREmoveElementFronArrayList() {
		// TODO Auto-generated method stubArrayList<String> color = new
		// ArrayList<String>();
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");

		// Retrive element from ArrayList
		String index3color = color.get(3);
		System.out.println("Original Color list : " + color);
		System.out.println("color at index 3 : " + index3color);

		// Update the element of ArrayList
		color.set(2, "Gray");
		System.out.println("Updating Second index of Color list : " + color);

		// Remove element from ArrayList
		color.remove(1);
		System.out.println("After remove element in Color list : " + color);
	}

	private static void searchElementInArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);

		// using ternary operator
		String searchString = color.contains("bule") ? "yes" : "No";
		System.out.println("this color is present : " + searchString);

		// using boolean
		boolean searchColor = color.contains("Black");
		if (searchColor) {
			System.out.println("Color is present in arraylist : " + searchColor);
		} else {
			System.out.println("Color is  not present in arraylist : " + searchColor);
		}
	}

	private static void sortArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);
		Collections.sort(color);
		System.out.println("After sorting color List : " + color);
	}

	private static void copyOneArrayListToAnother() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		// color.add("Black");
		// color.add("Purple");
		System.out.println("Original Color list : " + color);
		ArrayList<String> colorCopy = new ArrayList<String>();
		colorCopy.add("Green");
		colorCopy.add("Pink");
		colorCopy.add("White");
		colorCopy.add("Creamy");
		colorCopy.add("violet");
		Collections.copy(colorCopy, color);
		System.out.println("After copying : " + colorCopy);

	}

	private static void cloneArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Color list 1 : " + color);
		ArrayList<String> colorCopy = (ArrayList<String>) color.clone();
		colorCopy.add("Green");
		colorCopy.add("Pink");
		colorCopy.add("White");
		colorCopy.add("Creamy");
		colorCopy.add("violet");
		System.out.println("Color list 2 : " + colorCopy);
		Collections.copy(colorCopy, color);
		System.out.println("After clone arraylist : " + colorCopy);

	}

	private static void shuffleANdListElementInArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);
		// shuffle the ArrayList
		Collections.shuffle(color);
		System.out.println("After shuffle Color list : " + color);
		// reverse the ArrayList
		Collections.reverse(color);
		System.out.println("Reverse ArrayList : " + color);
	}

	private static void compareTwoArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list 1 : " + color);
		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("Green");
		color1.add("Yellow");
		color1.add("pink");
		color1.add("Black");
		color1.add("White");
		System.out.println("Original Color list 2 : " + color1);

		ArrayList<String> comapringArraylist = new ArrayList<String>();

		// using if_else
		for (String str : color) {
			if (color1.contains(str)) {
				System.out.println(comapringArraylist.add(str));
			} else {
				System.out.println(!comapringArraylist.add(str));
			}
		}
		// using ternary operator
		ArrayList<String> comapringArraylist1 = new ArrayList<String>();

		for (String str : color)
			comapringArraylist1.add(color1.contains(str) ? "yes" : "no");
		System.out.println(comapringArraylist1);
	}

	private static void swapTwoElementInArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);
		Collections.swap(color, 1, 4);
		System.out.println("After swapping two element in ArrayList" + color);
	}

	private static void joinTwoArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list 1 : " + color);
		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("Green");
		color1.add("Yellow");
		color1.add("pink");
		color1.add("Black");
		color1.add("White");
		System.out.println("Original Color list 2 : " + color1);
		ArrayList<String> combineArrayList = new ArrayList<String>();
		combineArrayList.addAll(color);
		combineArrayList.addAll(color1);
		System.out.println("Join two arraylist : " + combineArrayList);
	}

	private static void RemoveAllElementInArrayListAndCheck() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);
		color.removeAll(color);
		System.out.println("After removing all element in ArrayList" + color);
		System.out.println("ArrayList is empty or not : "+color.isEmpty());
	}
	private static void trimCapacityOfArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Orange");
		color.add("Black");
		color.add("Purple");
		System.out.println("Original Color list : " + color);
		color.ensureCapacity(10);
		System.out.println(" Color list : " + color);
		color.trimToSize();
		System.out.println(color);
	
	}

}

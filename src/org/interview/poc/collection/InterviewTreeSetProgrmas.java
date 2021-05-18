package org.interview.poc.collection;
/**
 * @author hemangi
 *
 */

import java.util.Iterator;
/**
 * @author hemangi
 *
 */
import java.util.TreeSet;

public class InterviewTreeSetProgrmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterviewTreeSetProgrmas.create_TreeSet_Add_elements_And_iterate();
		// InterviewTreeSetProgrmas.Add_ALL_First_TreeSet_Element_Another_TreeSet_And_clone_TreeSet();
		//InterviewTreeSetProgrmas.Get_the_element_in_TreeSet_And_Compare_Two_TreeSet();
		InterviewTreeSetProgrmas.find_the_numbers_less_than_7_in_TreeSet();

	}

	private static void find_the_numbers_less_than_7_in_TreeSet() {
		// TODO Auto-generated method stub
		TreeSet<Integer> number_set = new TreeSet<Integer>();
		number_set.add(4);
		number_set.add(2);
		number_set.add(0);
		number_set.add(9);
		number_set.add(10);
		System.out.println("the original number set is : "+number_set);
		
		TreeSet<Integer> number_lessThan7_set = new TreeSet<Integer>();
		
		number_lessThan7_set = (TreeSet<Integer>) number_set.headSet(7);
		Iterator iterator = number_lessThan7_set.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
			
		/*
		 * for(int no : number_set) { if(no<7) number_lessThan7_set.add(no); }
		 * System.out.println("The numbers less then 7 is : "+number_lessThan7_set);
		 */	}

	private static void Get_the_element_in_TreeSet_And_Compare_Two_TreeSet() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		TreeSet<String> color_set = new TreeSet<String>();
		color_set.add("Red");
		color_set.add("Yellow");
		color_set.add("Green");
		color_set.add("Orange");
		color_set.add("Blue");
		System.out.println("Original TreeSet 1 is : " + color_set);
		System.out.println("First Element : " + color_set.first());
		System.out.println("Last Element : " + color_set.last());

		TreeSet<String> color_set_1 = new TreeSet<String>();
		color_set_1.add("Brown");
		color_set_1.add("Black");
		color_set_1.add("Green");
		color_set_1.add("Orange");
		System.out.println("Original TreeSet 2 is : " + color_set_1);

		TreeSet<String> color_Set_2 = new TreeSet<String>();
		for (String str : color_set) {
			if (color_set_1.contains(str)) {
				color_Set_2.add(str);
			}
		}
		System.out.println("After compareing both TreeSet : " + color_Set_2);

	}

	private static void Add_ALL_First_TreeSet_Element_Another_TreeSet_And_clone_TreeSet() {
		// TODO Auto-generated method stub
		TreeSet<String> color_set = new TreeSet<String>();
		color_set.add("Red");
		color_set.add("Yellow");
		color_set.add("Green");
		color_set.add("Orange");
		color_set.add("Blue");
		System.out.println("Original TreeSet 1 is : " + color_set);
		TreeSet<String> color_set_1 = new TreeSet<String>();
		color_set_1.add("Brown");
		color_set_1.add("Black");
		color_set_1.add("Pink");
		color_set_1.add("Violet");
		System.out.println("Original TreeSet 2 is : " + color_set_1);
		color_set.addAll(color_set_1);
		System.out.println("After Adding second TreeSet in first TreeSet " + color_set);

		TreeSet<String> cloneTreeSet = new TreeSet<String>();
		cloneTreeSet = (TreeSet<String>) color_set.clone();
		System.out.println("After clone TreeSet is : " + cloneTreeSet);

	}

	private static void create_TreeSet_Add_elements_And_iterate() {
		// TODO Auto-generated method stub

		TreeSet<String> color_set = new TreeSet<String>();
		color_set.add("Red");
		color_set.add("Yellow");
		color_set.add("Green");
		color_set.add("Orange");
		color_set.add("Blue");
		System.out.println("Original TreeSet is : " + color_set);
		for (String str : color_set) {
			System.out.println(str);
		}

	}

}

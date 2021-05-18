package org.interview.poc.collection;

/**
 * @author hemangi
 *
 */

import java.util.Collections;
import java.util.LinkedList;

public class InterviewLinkedListPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterviewLinkedListPrograms.appendTheSpecifiedElementToLinkedList();
		// InterviewLinkedListPrograms.iterateAllELementInLinkedList();
		// InterviewLinkedListPrograms.iterateLinkedListInReverseOrder();
		// InterviewLinkedListPrograms.insertUpdateRemoveelementInLinkedList();
		// InterviewLinkedListPrograms.displayElementAndTherePositionLinkedList();
		// InterviewLinkedListPrograms.shuffleJoinSwapAndcloneLinkedList();
		// InterviewLinkedListPrograms.retriveElementInArrayList();
		//InterviewLinkedListPrograms.checkPerticularElementExitInLinkedList();

	}

	private static void appendTheSpecifiedElementToLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);

	}

	private static void iterateAllELementInLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);

		for (Integer i : list)
			System.out.println(i);

	}

	private static void iterateLinkedListInReverseOrder() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);
		Collections.reverse(list);
		System.out.println("Reverse the LinkedList is  : " + list);
	}

	private static void insertUpdateRemoveelementInLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);

		// insert/Update element in LinkedList
		list.set(3, 60);
		System.out.println("Updating the LinkedList " + list);

		// join Two LinkedList
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println("LinkedList is : " + list1);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.addAll(list);
		list2.addAll(list1);
		System.out.println("join to LinkedList" + list2);

	}

	private static void displayElementAndTherePositionLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("LinkedList element : " + list.get(i) + " " + "LinkedList Position : " + i);

		}

	}

	private static void shuffleJoinSwapAndcloneLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println("LinkedList is : " + list1);

		// clone the LinkedList
		System.out.println("shuffle the element in the LinkedList " + list);

		// Shuffle all numbers in LinkedList
		Collections.shuffle(list);
		System.out.println("shuffle the element in the LinkedList " + list);

		// swap two numbers in LinkedList
		Collections.swap(list, 01, 04);
		System.out.println("Swapping the element in the LinkedList " + list);

	}

	private static void retriveElementInArrayList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);
		System.out.println(list.get(3));

	}

	private static void checkPerticularElementExitInLinkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList is : " + list);
		String result = "";
		for(Integer i:list) {
			result = (list.contains(60))?"true":"false";
		}
		System.out.println(result);
	}

}

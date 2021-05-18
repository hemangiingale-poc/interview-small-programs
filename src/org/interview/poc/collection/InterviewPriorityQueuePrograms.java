package org.interview.poc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author hemangi
 *
 */

public class InterviewPriorityQueuePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterviewPriorityQueuePrograms.create_priorityQueue_Add_elements_And_iterate();
		// InterviewPriorityQueuePrograms.insert_removeAllElement_countNumberOfElement_inPriorityQueue();
		// InterviewPriorityQueuePrograms.compareTwoPriorityQueue();
		InterviewPriorityQueuePrograms.covertingPriorityQueuetoArray();

	}

	private static void create_priorityQueue_Add_elements_And_iterate() {
		// TODO Auto-generated method stub
		PriorityQueue<String> color = new PriorityQueue<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("Blue");
		System.out.println("The original priority queue is : " + color);
		Iterator<String> itr = color.iterator();
		System.out.println("after iterating elements are : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		color.poll();
		color.remove();
		System.out.println(color);
	}

	private static void insert_removeAllElement_countNumberOfElement_inPriorityQueue() {
		// TODO Auto-generated method stub
		PriorityQueue<String> color = new PriorityQueue<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("Blue");
		System.out.println("The original priority queue is : " + color);
		// inserting a specific element in queue
		color.offer("Black");
		System.out.println("After inserting element in priority queue is : " + color);
		// removing a specific element in queue
		color.remove("Yellow");
		color.poll();
		System.out.println("After removing element in priority queue is : " + color);
		// Count Number of element in priority queue
		System.out.println("Total element in priority Queue is : " + color.size());
	}

	private static void compareTwoPriorityQueue() {
		// TODO Auto-generated method stub
		PriorityQueue<String> color_1 = new PriorityQueue<String>();
		color_1.add("Red");
		color_1.add("Yellow");
		color_1.add("Green");
		color_1.add("Blue");
		System.out.println("The original priority queue is : " + color_1);
		PriorityQueue<String> color_2 = new PriorityQueue<String>();
		color_2.add("White");
		color_2.add("Yellow");
		color_2.add("Purple");
		color_2.add("Blue");
		System.out.println("The original priority queue is : " + color_1);
		PriorityQueue<String> color_3 = new PriorityQueue<String>();
		for (String str : color_1) {
			if (color_2.contains(str)) {
				color_3.add(str);
			}
		}
		System.out.println("After comparing two Priority Queue is : " + color_3);
	}

	private static void covertingPriorityQueuetoArray() {
		// TODO Auto-generated method stub
		PriorityQueue<String> color = new PriorityQueue<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("Blue");
		System.out.println("The original priority queue is : " + color);
		List<String> list = new ArrayList<String>(color);
		System.out.println("After converting priority queue into Array is "+list);
		
	}
}



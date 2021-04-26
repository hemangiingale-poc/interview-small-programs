package org.interview.poc.thread;

import java.util.ArrayList;

/**
 * @author hemangi
 *
 */

/*
 * 5) create 2 threads. one thread will display 1 to 50. second thread will
 * display 50 to 1. both the threads should start simultaneously.
 */

public class InterviewMultithreadingPrintEvenAndOddSuing2Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayEvenNumbers im = new DisplayEvenNumbers();
		DisplayOddNumbers im1 = new DisplayOddNumbers();
		Thread th = new Thread(im);
		th.start();
		Thread th1 = new Thread(im1);
		th1.start();
		DisplayEvenOddNumbers evenodd = new DisplayEvenOddNumbers();
		evenodd.start();

	}

}

class DisplayEvenNumbers implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int no = 20;
		for (int i = 1; i <= no; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

class DisplayOddNumbers implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int no = 20;
		for (int i = 1; i <= no; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}

class DisplayEvenOddNumbers extends Thread {
	public void run() {
		int no = 20;
		ArrayList<Integer> evenNo = new ArrayList<Integer>();
		ArrayList<Integer> oddNO = new ArrayList<Integer>();

		for (int i = 1; i <= no; i++) {
			if (i % 2 == 0) {
				evenNo.add(i);
				// System.out.println("Even no is : "+evenNo);
			} else {
				oddNO.add(i);
			}
		}
		System.out.println("Even no is : "+evenNo);
		System.out.println("odd no is : "+oddNO);
	}
}
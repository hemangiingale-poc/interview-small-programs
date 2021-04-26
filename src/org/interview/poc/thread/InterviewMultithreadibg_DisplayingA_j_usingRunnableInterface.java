package org.interview.poc.thread;

/**
 * @author hemangi
 *
 */
//create a multi-threaded application by using  "Runnable interface " method.create 2 threads. they should display characters from A to J.

public class InterviewMultithreadibg_DisplayingA_j_usingRunnableInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewMultithreadibg_DisplayingA_j_usingRunnableInterface obj = new InterviewMultithreadibg_DisplayingA_j_usingRunnableInterface();
		InterviewMultithreadibg_DisplayingA_j_usingRunnableInterface obj_1 = new InterviewMultithreadibg_DisplayingA_j_usingRunnableInterface();
		Thread th = new Thread(obj);
		Thread th1 = new Thread(obj_1);
		th.start();
		th1.start();

	}

	public void run() {
		for (char c = 'A'; c <= 'J'; c++) {
			System.out.print(c + " ");

		}

	}

}

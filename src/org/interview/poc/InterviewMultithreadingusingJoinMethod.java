package org.interview.poc;

/**
 * @author hemangi
 *
 */

// create 3 threads in such a way that while one thread is executing, 2 threads
// cannot interfere. they should display output "Exec 0" to "Exec 5".

public class InterviewMultithreadingusingJoinMethod extends Thread {
	public static void main(String[] args) {
		InterviewMultithreadingusingJoinMethod th = new InterviewMultithreadingusingJoinMethod();
		InterviewMultithreadingusingJoinMethod th1 = new InterviewMultithreadingusingJoinMethod();
		InterviewMultithreadingusingJoinMethod th2 = new InterviewMultithreadingusingJoinMethod();
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th1.start();
		th2.start();

	}

	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Exceution " + i);
		}
	}
}

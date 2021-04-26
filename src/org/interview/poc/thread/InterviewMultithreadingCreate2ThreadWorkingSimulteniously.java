package org.interview.poc.thread;

/**
 * @author hemangi
 *
 */

  //create 2 threads. one thread will display 1 to 50. second thread will display 50 to 1both the threads should start simultaneously. (use implements method)

public class InterviewMultithreadingCreate2ThreadWorkingSimulteniously{

	public static void main(String[] args) {
		ForwardNumberSeries forward = new ForwardNumberSeries();
		Thread th = new Thread(forward);
		ReverseNumberSeries reverse = new ReverseNumberSeries();
		Thread th1 =new Thread(reverse);
		
		th.start();
		th1.start();
	}
}

class ForwardNumberSeries implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=50;i++) { 
			System.out.println(i);
		}
		
	}
}
class ReverseNumberSeries implements Runnable{
	@Override
	public void run() {
		for(int i=50;i>0;i--) {
			System.out.println(i);
		}
		
		
	}
}
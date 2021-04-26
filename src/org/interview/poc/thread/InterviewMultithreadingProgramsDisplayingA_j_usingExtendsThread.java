package org.interview.poc.thread;

/**
 * @author hemangi
 *
 */

public class InterviewMultithreadingProgramsDisplayingA_j_usingExtendsThread extends Thread {

	public static void main(String[] args) {
		InterviewMultithreadingProgramsDisplayingA_j_usingExtendsThread th = new InterviewMultithreadingProgramsDisplayingA_j_usingExtendsThread();
		th.start();
		InterviewMultithreadingProgramsDisplayingA_j_usingExtendsThread th1 = new InterviewMultithreadingProgramsDisplayingA_j_usingExtendsThread();
		th1.start();

	}
	public void run() {
		for(char c='A';c<='J';c++) {
			System.out.print(c+" ");
		}
	}

}

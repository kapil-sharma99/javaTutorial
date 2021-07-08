package com.kapilsharma.multithread;

class Task1 extends Thread {
	public void run() {
		System.out.print("\nTask1 Started");
		for(int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task1 completed");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		//Task1
		Task1 task1 = new Task1();
		task1.start();
		
		//Task2
		for(int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task 2 is done!!");
		
		//Task3
		for(int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task 3 is done!!");
		System.out.println("\n Main Method done is done!!");
	}

}

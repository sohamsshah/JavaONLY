package Multithreading;

public class Multithreading5 {

	public static void main(String[] args) {
 
		// optimizing the code and putting the runnable interface objects inside Thread object itself
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}

		}, "Hi Thread"); // Naming a thread
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}

		}, "Hello Thread"); // Naming a thread
		
		// Alternative to name a thread is to use t.setName(name) using setter
		
		// Prints the name of the thread using getter
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		// Priority of Threads
		
		// All threads are default initialized as priority=5 i.e NORM_PRIORITY
		
		// Setting Priority by using Setter
		
		t1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10
		t2.setPriority(Thread.MIN_PRIORITY); // MIN_PRIORITY = 1
		
		// Can access by using Getters
		System.out.println(t1.getPriority()); 
		System.out.println(t2.getPriority());
		
		// Refer current thread by using: Thread.currentThread().getPriority()
		t1.start();
		try {
			Thread.sleep(50);
		} catch (Exception e) {
		}
		t2.start();
	}

}

package Multithreading;

public class Multithreading4 {

public static void main(String[] args) throws Exception{
		
		Runnable obj1 = () -> {
				for(int i=0; i<5; i++) {
					System.out.println("Hi");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			
		};
		
		Runnable obj2 = () -> {
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		
	};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(50);}catch(Exception e) {}
		t2.start();
		
		//Waits till the threads t1 and t2 join back to the main thread by using join() method
		t1.join();
		t2.join();
		
		// Checks if they are alive. Must return false
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		//After they are joined, then main thread prints the below statement
		System.out.println("Bye...");
	}

}

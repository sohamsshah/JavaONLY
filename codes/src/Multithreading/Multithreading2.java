// Multithreading using Runnable Interface. By using interface we can use Multiple inheritance

package Multithreading;

class Hi implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(500);}catch(Exception e) {} // sleeps for 500 milisecond so the other Thread 'Hello' can be executed
		} 
	}
}

class Hello implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);}catch(Exception e) {} // sleeps for 500 milisecond so the other Thread 'Hi' can be executed
			}
	}
}

public class Multithreading2 {
	public static void main(String args[]) {
	Runnable obj1 = new Hi();
	Runnable obj2 = new Hello();
	
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	
	
	t1.start(); // starts the execution of thread object referencing Hi
	try {Thread.sleep(10);}catch(Exception e) {}
	t2.start(); // starts the execution of thread object referencing Hello
	}

}

// Outputs:
//Hi
//Hello
//Hi
//Hello
//Hi
//Hello
//Hi
//Hello
//Hi
//Hello



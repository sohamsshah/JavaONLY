package Multithreading;

//we extend classes Hi and Hello with Thread class 
//By using Thread Class
class Hey extends Thread{
	public void run() {
		for(int i=0; i<5;i++) {
		System.out.println("Hey");
		try {Thread.sleep(500);}catch(Exception e) {} // sleeps for 500 milisecond so the other Thread 'Hello' can be executed
		} 
	}
}

class Hola extends Thread{
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Hola");
			try {Thread.sleep(500);}catch(Exception e) {} // sleeps for 500 milisecond so the other Thread 'Hi' can be executed
			}
	}
}

public class Multithreading1 {
	public static void main(String args[]) {
	Hey obj1 = new Hey();
	Hola obj2 = new Hola();
	
	obj1.start(); // starts the execution of thread object referencing Hi
	try {Thread.sleep(10);}catch(Exception e) {}
	obj2.start(); // starts the execution of thread object referencing Hello
	}

}

// Outputs:
//Hey
//Hola
//Hey
//Hola
//Hey
//Hola
//Hey
//Hola
//Hey
//Hola



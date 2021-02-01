// Interface and Abstract Class
//1. One has to extend an abstract class, while Interface can only be implemented using implement keyword
//2. In interface all methods must be abstract compulsorily.
//3. One must use interface wherever possible instead of abstract
//4. We can achieve Multiple Inheritance using Interface in Java
//5.In Java we cannot do multiple inheritance with class as it causes ambiguity of which method to choose.


// Types of Interface
// 1. Normal -  multiple abstract methods
// 2. Single Abstract Method -  Functional Interface -  Lambda Expression
// 3. Marker Interface - without any method Eg. Serializable

@FunctionalInterface //annotation
interface Writer{
	abstract void write();
}

@FunctionalInterface
interface DefaultDemo{
	abstract void write();
	default void show() { // can be overrided
		System.out.println("inside default method of abstract");
	}
}

class Pen implements Writer{
	public void write() {
		System.out.println("I am a Pen");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("I am a Pencil");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Writer p = new Pen();
		Writer pc = new Pencil();
		pc.write();
		p.write();
		
		Writer obj = () -> System.out.println("Lambda Expression");
		// The above code can also be written as the concept of anonymous interface:
//		Writer obj = new Writer() {
//			public void write() {
//				System.out.println("Lambda Expression");
//			}
//		};
		obj.write();
	}

}

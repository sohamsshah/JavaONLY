// Interface and Abstract Class
//1. One has to extend an abstract class, while Interface can only be implemented using implement keyword
//2. In interface all methods must be abstract compulsorily.
//3. One must use interface wherever possible instead of abstract
//4. We can achieve Multiple Inheritance using Interface in Java
//5.In Java we cannot do multiple inheritance with class as it causes ambiguity of which method to choose.

interface Writer{
	abstract void write();
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

	}

}

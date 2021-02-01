// Inner class is of three types
//Member class
//Static class
//Anonymous class


class Outer{
	//member variable
	int a; 
	// member method
	public void show() { 
		
	}
	// member Class
	class Inner{
		
		public void display() {
			System.out.println("Hello");
		}
		
	}
	
	static class InnerStatic{
		public void display() {
			System.out.println("inside static");
		}
	}
}


public class InnerDemo {

	public static void main(String[] args) {
	
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = obj.new Inner();
		Outer.InnerStatic obj2 = new Outer.InnerStatic();
		obj1.display();
		obj2.display();

	}

}

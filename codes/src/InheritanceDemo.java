// When we extend a class, it is an IS-A relationship
// When we use an object of a class n another class, it is a HAS-A relationship

class Calculator{ //super, parent, base
	public int add(int i, int j) {
		return i+j;
	}
}

class CalculatorAdv extends Calculator{ //subclass, child, derived
	public int sub(int i, int j) {
		return i-j;
	}
}

class CalculatorVeryAdv extends CalculatorAdv{
	public int multi(int i, int j) {
		return i*j;
	}
}


public class InheritanceDemo {
	
	public static void main(String args[]) {
		CalculatorVeryAdv obj = new CalculatorVeryAdv();
		System.out.println(obj.add(1, 1));
		System.out.println(obj.sub(1, 1));
		System.out.println(obj.multi(1, 1));
		
		
	}

}

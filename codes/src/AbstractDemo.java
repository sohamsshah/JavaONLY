// Human class is created so that for someone to extend it. We dont want anyone to create object of human directly.

// final keyword: 
//If used with class, no one can extend it
//If used with method, no one can override it
//If used with variable, no one can edit it

abstract class Human{ // Compulsory for the class to be abstract to have abstract methods
	public abstract void eat(); // declaring methods using abstract instead of defining
	public abstract void drink();
}

class Man extends Human{ // Concrete Class
	public void eat() { // compulsory to implement if inheriting abstract class
		
	}
	public void drink() {
			
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Human obj = new Man();

	}

}

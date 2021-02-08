// Animal abstract class is created so that for someone to extend it.
// We dont want anyone to create object of Animal directly.
// Abstract classes can have both abstract and concrete methods.

// final keyword: 
// If used with class, no one can extend it
// If used with method, no one can override it
// If used with variable, no one can edit it

abstract class Animal { // Compulsory for the class to be abstract to have abstract methods
    public abstract void talk(); // declaring methods using abstract instead of defining

    public final void drink() { // method cannot be overriden in subclass.
        System.out.println("I am drinking...");
    }
}

class Dog extends Animal { // Concrete Class

    @Override
    public void talk() { // compulsory to implement if inheriting abstract class
        System.out.println("Wooof Wooooff");
    }
}

class Cat extends Animal {

	@Override
	public void talk() {
		System.out.println("Meeeooooowwwwwwww");
	}

	public void slurp() {
		System.out.println("Slluuurrrppppppppppppp");
	}
}

public class AbstractDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.talk();
        dog.drink();

        cat.talk();
        cat.drink();

        // cat.slurp(); -> This will cause an error because of line 40: Animal cat = new Cat();
		// Recognises functions only defined under Animal class but prints all the overriden methods.

		// However...
		((Cat) cat).slurp(); // ...works because of explicit type casting.
    }

}

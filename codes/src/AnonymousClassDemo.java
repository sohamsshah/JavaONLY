class Abc{
	public void show() {
		System.out.println("in A show");
	}
}

interface AbcInterface{
	void show();
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		// anonymous method overriding
		Abc obj = new Abc() {
			public void show() {
				System.out.println("inside anonymous");
			}
		};
		
		// interface using anonymous class
		AbcInterface obj1 =  new AbcInterface() {
			public void show() {
				System.out.println("Problem Solved.");
			}
		};
		obj.show();
		obj1.show();

	}

}

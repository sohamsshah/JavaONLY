// child class method generally overrides parent class methods

class OverRidden{
	int i;
	public void show() {
		System.out.println("in OverRidden"+ i);
	}
}

class OverRider extends OverRidden{
	
	@Override //annotation
	public void show() {
		super.i = 7;
		super.show();
		
		System.out.println("in OverRider");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		OverRider obj = new OverRider();
		obj.show();

	}

}

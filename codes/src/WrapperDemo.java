// Wrapper classes" Integer, Float, Double, Long, Boolean etc. 8 classes


public class WrapperDemo {

	public static void main(String[] args) {
		int i = 5; //primitive datatype
		Integer ii = Integer.valueOf(5); // Wrapper class
		
		// When we use Primitive value inside a Wrapper class, it is called Boxing or Wrapping
		Integer iii = Integer.valueOf(i); // boxing - wrapping
		int j = iii.intValue(); // unboxing - unwrapping
		
		Integer value = i; //AutoBoxing
		int k = value; // Auto unboxing
		System.out.println(value);
		
		// Speed: primitive > Wrapper
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}
	

}

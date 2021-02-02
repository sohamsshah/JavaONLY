import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		// Unchecked Exceptions
		try {
			int arr[] = new int[100];
			arr[101] = 120; //array index out of bounds
			int i=7;
			int j=0;
			int k = i/j; // arithmetic exception
			System.out.println("Output is: " + k);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { // handles two exceptions at a time
			System.out.println(e);
		}
		catch(Exception e) { // handles all exceptions
			System.out.println("Something Wrong...");
		}
		finally {
			System.out.println("Done...");
		}
		
		// IO exceptions (Checked Exceptions)
		
		int n=0;
		System.out.println("Enter a number: ");
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch (Exception e){
			System.err.println(e);
		}
		finally {
			br.close(); // closes the resource even of exception occurs
		}
		System.out.println(n);
		

	}

}

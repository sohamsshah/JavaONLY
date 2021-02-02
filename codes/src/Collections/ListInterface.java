package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List values = new ArrayList(); // List of Objects
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(2,4); // adds 4 at index 2
		values.add("Soham"); // this works as any object can be accepted
		
		// normal interation
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i)); //gets value at index i
		}
		
		// enhanced for loop
		for(Object o:values) {
			System.out.println(o); //gets value at index i
		}
		
		
		

	}

}

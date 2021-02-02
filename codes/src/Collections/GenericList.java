package Collections;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(); // type safe to Integer List only
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(2,4); // adds 4 at index 2
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i)); //gets value at index i
		}

	}

}

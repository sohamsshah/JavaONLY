package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
	
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(); // type safe to Integer List only
		values.add(404);
		values.add(123);
		values.add(100);
		values.add(2788); 
		
		// Using comparator to override the compare method
		
		// Lambda Expression
		Comparator<Integer> c = (i,j) -> i%10>j%10?1:-1;
		
		// Comparator to sort based on last digit
		Collections.sort(values,c);
		
		for(Integer o: values) {
			System.out.println(o);
		}

	}


}

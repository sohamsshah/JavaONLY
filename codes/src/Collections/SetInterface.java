package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		// Sequence is not maintained in HashSet
		Set<Integer> values = new HashSet<>();
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(9); // Set doesnt contain any duplicate values, so it wont add another redundant 9
		
		System.out.println(values);
		for(int i: values) {
			System.out.println(i);
		}

		// Sequence is maintained in TreeSet
		Set<Integer> treeValues = new TreeSet<>();
		treeValues.add(5);
		treeValues.add(8);
		treeValues.add(10);
		
		System.out.println(treeValues);
		for(int i: treeValues) {
			System.out.println(i);
		}
	}

}

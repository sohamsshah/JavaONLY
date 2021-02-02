package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollno;
	int marks;
	String name;
	
	public Stud(int rollno, String name ,int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Stud [rollno= " + rollno + ", marks= "+ marks + ",name= "+ name + "]"; 
	}
	
	public int compareTo(Stud s) {
		// compare here 
		return marks>s.marks?1:-1;
	}
}
public class ComparableInterface {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23, "Sunil", 95));
		studs.add(new Stud(51, "Soham", 50));
		studs.add(new Stud(24, "Samyak", 80));
		studs.add(new Stud(33, "Bina", 99));
		
		Collections.sort(studs);
		for(Stud s: studs) {
			System.out.println(s);
		}
	}

}

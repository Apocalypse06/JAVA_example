package ch09._08_comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableDemo0 {
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "�i�v��", 95, 90, 80);
		Student s2 = new Student(100, "�Ůa�_", 90, 95, 80);
		Student s3 = new Student(102, "�p�l�l", 99, 90, 76);
		Student s4 = new Student(201, "�g�A�l", 95, 91, 60);
		Student s5 = new Student(601, "������", 75, 80, 60);
		Student s6 = new Student(210, "���T��", 75, 70, 70);
	    List<Student> ts = new ArrayList<Student>();
	    ts.add(s1);ts.add(s2);ts.add(s3);
	    ts.add(s4);ts.add(s5);ts.add(s6);
	    Collections.sort(ts);
	    for(Student s:ts){
	    	System.out.println(s);
	    }
	}
}

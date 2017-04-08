package ComparbleOrComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable {
	int id,age;
	String name;
	

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		Student st= (Student)obj;
		if(age==st.age){
			return 0;	
		}else if (age>st.age)
		return 1;
		else
		return -1;
	}

	public static void main(String[] args) {
	
		ArrayList<Student> a1= new ArrayList<Student>();
		a1.add(new Student(1,24,"Eswar"));
		a1.add(new Student(2,21,"Harsha"));
		a1.add(new Student(3,22,"Teja"));
		
		Collections.sort(a1);
		Iterator it = a1.iterator();
		while(it.hasNext()){
			Student s1= (Student)it.next();
			System.out.println(s1.name+" " +s1.id+" " +s1.age);
		}
		

	}



}

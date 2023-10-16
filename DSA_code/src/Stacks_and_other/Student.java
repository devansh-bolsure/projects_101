package Stacks_and_other;

import java.util.Objects;

public class Student  implements Comparable<Student>
{

	String name;
	int roll_no;
	
	Student(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll_no == other.roll_no;
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return this.roll_no-that.roll_no;
		//return this.name.compareTo(that.name);
	}
	
	
}

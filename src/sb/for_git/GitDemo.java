package sb.for_git;

import java.util.ArrayList;
import java.util.List;

import sb.for_git.ex_1.Student;

public class GitDemo {

	public static void main(String[] args) {
		System.out.println("\n this project is to learn git");
		
		Student student = new Student(1,"nilesh");
		student.toString();
	}
	
	static void modifyStudent() {
		List<Student> students= new ArrayList<>();
		students.add(new Student(101,"nilesh"));
		students.add(new Student(102,"raj"));

	}
}

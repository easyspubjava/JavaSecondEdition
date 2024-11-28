package chapter5.q12.test;

import chapter5.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "서울 양천구";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}


package chapter6.q9;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		System.out.println("학번: " + studentKim.studentID + ", 카드 번호: " + studentKim.cardNumber);
		
		Student studentLee = new Student();
		System.out.println("학번: " + studentLee.studentID + ", 카드 번호: " + studentLee.cardNumber);
	}
}

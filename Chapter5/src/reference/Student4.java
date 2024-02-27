package reference;

public class Student4 {

	int studentID;
	String studentName;
	Subject2 korean;
	Subject2 math;
	
	public Student4(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject2();
		math = new Subject2();
	}

	public void showStudentInfo()
	{
		int total = korean.getScorePoint() + math.getScorePoint();

	}

	public void setKoreanSubject(String subjectName, int score) {
		korean.setSubjectName(subjectName);
		korean.setScorePoint(score);
	}

	public void serMathSubject(String subjectName, int score) {
		math.setSubjectName(subjectName);
		math.setScorePoint(score);
	}
}

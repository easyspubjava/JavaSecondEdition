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
		System.out.println(studentName + "님의 " + korean.getSubjectName() + " 과목의 점수는 "
				+ korean.getScorePoint() + "점 이며 " + math.getSubjectName() + " 과목의 점수는 "
		+ math.getScorePoint() + "점입니다.");

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

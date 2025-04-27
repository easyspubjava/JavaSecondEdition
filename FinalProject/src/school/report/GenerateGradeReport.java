package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.GradeType;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 \t|  학번\t |   중점과목\t | 점수\t|   \n";
	public static final String LINE = "-------------------------------------\n";
	private StringBuilder buffer = new StringBuilder();
	
	public String getReport(){
		ArrayList<Subject> subjectList = school.getSubjectList();  // 모든 과목에 대한 학점 산출
		for( Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();  // String 으로 반환
	}
	
	public void makeHeader(Subject subject){
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t\t" + subject.getName());
		buffer.append(GenerateGradeReport.TITLE );
		buffer.append(GenerateGradeReport.HEADER );
		buffer.append(GenerateGradeReport.LINE);
	} 
	
	public void makeBody(Subject subject){
		
		ArrayList<Student> studentList = subject.getStudentList();  // 각 과목의 학생들
		
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getName());
			buffer.append(" \t| ");
			buffer.append(student.getId());
			buffer.append(" |\t ");
			buffer.append(student.getMajorSubject().getName() + "\t");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.getId());  //학생별 해당과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId){
		
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getId();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};  //학점 평가 클래스들
		
		for(int i=0; i<scoreList.size(); i++){  // 학생이 가진 점수들 
			
			Score score = scoreList.get(i);
			if(score.getSubject().getId() == subjectId) {  // 현재 학점을 산출할 과목
				String grade;
				if(score.getSubject().getId() == majorId)  // 중점 과목인 경우
					grade = gradeEvaluation[GradeType.SABTYPE.getValue()].getGrade(score.getPoint());  //중점 과목 학점 평가 방법
				else
					grade = gradeEvaluation[GradeType.ABTYPE.getValue()].getGrade(score.getPoint()); // 중점 과목이 아닌 경우
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
	
	public void makeFooter(){
		buffer.append("\n");
	}
}
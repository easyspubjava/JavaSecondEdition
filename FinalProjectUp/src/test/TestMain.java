package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.GradeType;
import utils.SubjectCode;

public class TestMain {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;

	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //성적 결과 생성
		System.out.println(report); // 출력
		
	}
	
	//테스트 과목 생성
	public void creatSubject(){
		
		korean = new Subject(SubjectCode.KOREAN.getName(), SubjectCode.KOREAN.getId());
		math = new Subject(SubjectCode.MATH.getName(), SubjectCode.MATH.getId());
		dance = new Subject(SubjectCode.DANCE.getName(), SubjectCode.DANCE.getId());

		dance.setGradeType(GradeType.PFTYPE);

		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}
	
	//테스트 학생 생성
	public void createStudent(){
		
		Student student1 = new Student(251213, "강감찬", korean  );
		Student student2 = new Student(252330, "김유신", math  );
		Student student3 = new Student(251518, "신사임당", korean  );
		Student student4 = new Student(252360, "이순신", korean  );
		Student student5 = new Student(251290, "홍길동", math );
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);

		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);

		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		addScoreForStudent(student1, korean, 95); 
		addScoreForStudent(student1, math, 56);	
		addScoreForStudent(student1, dance, 95);

		addScoreForStudent(student2, korean, 95); 
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 85);

		addScoreForStudent(student3, korean, 100); 
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 55);
		
		addScoreForStudent(student4, korean, 89); 
		addScoreForStudent(student4, math, 95);	
		
		addScoreForStudent(student5, korean, 85); 
		addScoreForStudent(student5, math, 56);


	}

	//과목별 성적 입력
	public void addScoreForStudent(Student student, Subject subject, int point){
		
		Score score = new Score(student.getId(), subject, point);
		student.addSubjectScore(score);
		
	}
}

package school;

import utils.GradeType;

import java.util.ArrayList;


public class Subject {
	private String name;  //과목 이름
	private int id;      // 과목 고유번호
	private GradeType gradeType;      // 과목 평가 방법 기본은 A,B 방식
	
	//수강 신청한 학생 리스트
	//register() 메서드를 호출하면 리스트에 추가 됨
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String name, int id){
		this.name = name;
		this.id = id;
		this.gradeType = GradeType.ABTYPE;   //기본적으로 A, B 타입
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public GradeType getGradeType() {
		return gradeType;
	}

	public void setGradeType(GradeType gradeType) {
		this.gradeType = gradeType;
	}

	public void register(Student student){  //수강신청
		studentList.add(student);
	}
}

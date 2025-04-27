package school;

import java.util.ArrayList;

public class Student {
	
	private int id;    		//학번
	private String name;		//이름
	private Subject majorSubject;	//중점 과목
	
	//학생의 성적 리스트 
	//addSubjectSocre() 메서드가 호출되면 리스트에 추가 됨
	private ArrayList<Score> scoreList = new ArrayList<Score>(); 
	
	public Student( int id, String name, Subject majorSubject){
		this.id = id;
		this.name = name;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList(){
		return scoreList;
	}
	
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}

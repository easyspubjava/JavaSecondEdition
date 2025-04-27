package utils;

public enum SubjectCode {

	KOREAN("국어", 1001),
	MATH("수학", 1002),
	DANCE("방송 댄스", 1003);

	private String name;
	private int id;

	SubjectCode(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

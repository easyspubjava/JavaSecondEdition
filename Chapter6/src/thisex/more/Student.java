package thisex.more;

class Student {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int grade){
        this(id, name);
        this.grade = grade;
    }

    public Student(int id, String name, int grade, String major, String phoneNumber){
        this(id, name, grade);
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public void showStudentInfo(){
        System.out.println(name +"님의 학번은 " + id + "이고, " + grade + "학년입니다.");
    }
}


package chapter11.q6;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return name + " " + id;
    }

    public static void main(String[] args) {
        Student studentJ = new Student("이순신", 1001);
        System.out.println(studentJ);
    }
}

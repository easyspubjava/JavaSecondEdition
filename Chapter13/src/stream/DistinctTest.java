package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class DistinctTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100, "이윤선");
        Student studentMoon = new Student(200, "문찬욱");
        Student studentLee2 = new Student(100, "이윤선");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentLee);
        studentList.add(studentMoon);
        studentList.add(studentLee2);

        studentList.stream()
                .distinct()             // 같은 멤버는 제외하기
                .forEach(s-> System.out.println(s.getName()));

        studentList.stream()
                .distinct()
                .forEach(s-> System.out.println(s.getName() + "님 안녕하세요"));
    }
}

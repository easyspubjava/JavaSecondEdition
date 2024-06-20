package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Person 클래스 정의
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Exercise9 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("안소현", 17),
                new Person("신민우", 20),
                new Person("박석희", 15),
                new Person("이종민", 22)
        );

        // filter 메서드를 사용하여 18세 이상인 사람 필터링
        List<String> adultNames = people.stream()
                .filter(p -> p.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println(adultNames);
    }
}
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Function<String, Integer> stringLength = String::length;

        List<Integer> lengths = words.stream()
                .map(stringLength) //
                .collect(Collectors.toList()); // 스트림을 리스트로 변환

        System.out.println(lengths); // [5, 6, 6]
    }
}

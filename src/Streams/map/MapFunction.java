package Streams.map;

import java.util.List;

public class MapFunction {
    public static void calculateSquaresOfNumbers(List<Integer> numbers) {
        numbers.stream()
               .map(number -> number * number)
               .forEach(System.out::println);
    }

    public static void printLengthOfCourses(List<String> courses) {
        courses.stream()
               .map(String::length)
               .forEach(System.out::println);
    }
}

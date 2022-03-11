package Streams.filter;

import java.util.List;

public class FilterFunction {

    public static void getEvenOrOddNumbers(List<Integer> numbers, String evenOrOdd) {
        int remainder = evenOrOdd.equalsIgnoreCase("even") ? 0 : 1;
        numbers.stream()
               .filter(number -> number % 2 == remainder)
               .forEach(System.out::println);
    }

    public static void containsCourse(List<String> courses) {
        courses.stream()
               .filter(course -> course.contains("Spring"))
               .forEach(System.out::println);
    }
}

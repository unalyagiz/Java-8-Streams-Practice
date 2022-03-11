package Streams;

import Streams.reduce.ReduceFunction;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF",
                "Azure", "Docker", "Kubernetes");
        List<Integer> numbers = Arrays.asList(1, 2, 3); //Arrays.asList(1, 4, 5, 16, 49, 32, 7);

        //FilterFunction.containsCourse(courses);
        //FilterFunction.getEvenOrOddNumbers(numbers, "even");
        //Map.calculateSquaresOfNumbers(numbers);
        //MapFunction.printLengthOfCourses(courses);
        System.out.println(ReduceFunction.getMaximumValue(numbers));
        System.out.println(ReduceFunction.getSumOfSquares(numbers));
        System.out.println(ReduceFunction.getSumOfOddNumbers(numbers));


    }
}

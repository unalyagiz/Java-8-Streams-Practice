package Streams.reduce;

import java.util.List;

public class ReduceFunction {

    public static Integer getMaximumValue(List<Integer> numbers) {
        return numbers.stream()
                      .reduce(0, (x, y) -> x + y);
    }

    public static Integer getSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                      .reduce(0, (x, y) -> x + y * y);
    }

    public static Integer getSumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(number -> number % 2 != 0)
                      .reduce(0, Integer::sum);
    }

}

package techcourse.fp.mission;

import java.util.List;

public class Calculator {
    public static int sumAll(List<Integer> numbers) {
        int total = 0;
        return numbers.stream()
                .reduce(total, Integer::sum);
    }

    public static int sumAllEven(List<Integer> numbers) {
        int total = 0;
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(total, Integer::sum);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        int total = 0;
        return numbers.stream()
                .filter(name -> name > 3)
                .reduce(total, Integer::sum);
    }
}

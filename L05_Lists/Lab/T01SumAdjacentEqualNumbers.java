package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        sumNumbers(numbers);
    }

    private static void sumNumbers(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        printResult(numbers);
    }

    private static void printResult(List<Double> numbers) {
        DecimalFormat df = new DecimalFormat("#.#");
        for (Double num : numbers) {
            System.out.print(df.format(num) + " ");
        }
    }
}
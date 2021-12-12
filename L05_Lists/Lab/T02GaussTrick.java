package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        sumNumbers(numbers);
    }

    private static void sumNumbers(List<Integer> numbers) {
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.get(numbers.size() - 1));
        }
        printResult(numbers);
    }

    private static void printResult(List<Integer> numbers) {
        System.out.println(numbers.toString()
                .replaceAll("[\\[\\]]", "")
                .replaceAll(", ", " "));
    }
}
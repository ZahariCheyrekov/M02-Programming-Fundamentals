package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        String[] powerNumbers = scanner.nextLine().split("\\s+");

        detonateNumbers(numbers, powerNumbers);
        printResult(numbers);
    }

    private static void detonateNumbers(List<Integer> numbers, String[] powerNumbers) {
        int bombNumber = Integer.parseInt(powerNumbers[0]);
        int bombPower = Integer.parseInt(powerNumbers[1]);

        while (numbers.contains(bombNumber)) {
            int indexBomb = numbers.indexOf(bombNumber);

            int left = Math.max(0, indexBomb - bombPower);
            int right = Math.min(numbers.size() - 1, indexBomb + bombPower);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }
    }

    private static void printResult(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
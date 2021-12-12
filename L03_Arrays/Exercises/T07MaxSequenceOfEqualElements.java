package M02_ProgrammingFundamentals.L03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class T07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int number = 0;
        int maxSequence = 1;
        int combinations = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                combinations++;
            } else {
                combinations = 1;
            }
            if (maxSequence < combinations) {
                maxSequence = combinations;
                number = numbers[i];
            }
        }
        for (int i = 1; i <= maxSequence; i++) {
            System.out.print(number + " ");
        }
    }
}
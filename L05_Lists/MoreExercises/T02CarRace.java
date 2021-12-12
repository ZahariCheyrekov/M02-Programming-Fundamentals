package M02_ProgrammingFundamentals.L05_Lists.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class T02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        double leftRacerSum = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] == 0) {
                leftRacerSum *= 0.80;
            } else {
                leftRacerSum += numbers[i];
            }
        }

        double rightRacerSum = 0;
        for (int i = numbers.length - 1; i > numbers.length / 2; i--) {
            if (numbers[i] == 0) {
                rightRacerSum *= 0.80;
            } else {
                rightRacerSum += numbers[i];
            }
        }
        if (leftRacerSum < rightRacerSum) {
            System.out.printf("The winner is left with total time: %.1f", leftRacerSum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightRacerSum);
        }
    }
}
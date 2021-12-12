package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.Scanner;

public class T08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String strings : input) {
            char before = strings.charAt(0);
            char after = strings.charAt(strings.length() - 1);
            double number = Integer.parseInt(strings.substring(1, strings.length() - 1));

            totalSum += currentValue(before, after, number);
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double currentValue(char before, char after, double number) {
        double value = 0;

        if (Character.isUpperCase(before)) {
            value += number / (before - 'A' + 1);
        } else {
            value += number * (before - 'a' + 1);
        }

        if (Character.isUpperCase(after)) {
            value -= after - 'A' + 1;
        } else {
            value += after - 'a' + 1;
        }
        return value;
    }
}

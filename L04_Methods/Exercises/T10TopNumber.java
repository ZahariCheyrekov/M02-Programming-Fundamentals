package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 17; i <= number; i++) {
            if (isDivisible(i) && checkForOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisible(int currentNumber) {
        int sumDigits = 0;
        while (currentNumber > 0) {
            sumDigits += currentNumber % 10;
            currentNumber /= 10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean checkForOddDigit(int currentNumber) {
        while (currentNumber > 0) {
            int digit = currentNumber % 10;
            if (digit % 2 == 1) {
                return true;
            }
            currentNumber /= 10;
        }
        return false;
    }
}
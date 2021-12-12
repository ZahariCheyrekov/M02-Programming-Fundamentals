package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            int sumDigits = 0;
            while (currentNum > 0) {
                sumDigits += currentNum % 10;
                currentNum /= 10;
            }
            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
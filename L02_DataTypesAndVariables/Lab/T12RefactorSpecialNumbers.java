package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numbers; i++) {
            int currentNumber = i;
            int sumDigits = 0;
            while (currentNumber > 0) {
                sumDigits += currentNumber % 10;
                currentNumber /= 10;
            }
            if ((sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11)) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        signInteger(number);
    }

    private static void signInteger(int number) {
        if (number == 0) {
            System.out.println("The number 0 is zero.");
        }
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        }
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
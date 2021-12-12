package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double calculated = factorial(firstNum) / factorial(secondNum);

        System.out.printf("%.2f", calculated);
    }

    private static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNUmber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        calculated(firstNUmber, secondNumber, operator);
    }

    private static void calculated(int firstNUmber, int secondNumber, String operator) {
        int result = 0;
        switch (operator) {
            case "/":
                result = firstNUmber / secondNumber;
                break;
            case "*":
                result = firstNUmber * secondNumber;
                break;
            case "+":
                result = firstNUmber + secondNumber;
                break;
            case "-":
                result = firstNUmber - secondNumber;
                break;
        }
        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
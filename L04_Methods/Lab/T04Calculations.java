package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        calculate(command, firstNumber, secondNumber);
    }

    private static void calculate(String command, int firstNumber, int secondNumber) {
        switch (command) {
            case "add":
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;
        }
    }

    private static void addNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        printResult(result);
    }

    private static void multiplyNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        printResult(result);
    }

    private static void subtractNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        printResult(result);
    }

    private static void divideNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
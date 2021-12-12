package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumFirstTwo(firstNumber, secondNumber);
        int subtract = subtractNumbers(sum, thirdNumber);
        printResult(subtract);
    }

    private static int sumFirstTwo(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtractNumbers(int sum, int thirdNumber) {
        return sum - thirdNumber;
    }

    private static void printResult(int subtract) {
        System.out.println(subtract);
    }
}
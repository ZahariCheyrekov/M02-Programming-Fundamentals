package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(firstNumber, secondNumber));
    }

    private static int calculateArea(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
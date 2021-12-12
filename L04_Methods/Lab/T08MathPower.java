package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        calculatePower(firstNumber, secondNumber);
    }

    private static void calculatePower(double firstNumber, double secondNumber) {
        double result = Math.pow(firstNumber, secondNumber);
        printResult(result);
    }

    private static void printResult(double result) {
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
}
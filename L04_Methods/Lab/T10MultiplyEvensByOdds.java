package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(multiply(num));
    }

    public static int multiply(int num) {
        int sumEven = 0;
        int sumOdd = 0;
        while (num > 0) {
            int currentNumber = num % 10;
            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            } else {
                sumOdd += currentNumber;
            }
            num = num / 10;
        }
        return sumEven * sumOdd;
    }
}
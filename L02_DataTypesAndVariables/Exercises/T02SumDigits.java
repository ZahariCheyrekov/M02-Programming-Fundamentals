package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sumDigits = 0;
        while (number > 0) {
            sumDigits += number % 10;
            number /= 10;
        }
        System.out.println(sumDigits);
    }
}
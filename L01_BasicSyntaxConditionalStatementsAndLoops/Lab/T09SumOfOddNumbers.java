package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 1;
        int finalSum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(sum);
            finalSum += sum;
            sum += 2;
        }
        System.out.printf("Sum: %d", finalSum);
    }
}
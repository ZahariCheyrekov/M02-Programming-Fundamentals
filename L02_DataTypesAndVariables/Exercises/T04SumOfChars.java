package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= operations; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            sum += currentChar;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
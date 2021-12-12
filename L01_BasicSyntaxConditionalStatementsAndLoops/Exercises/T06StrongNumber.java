package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numToString = Integer.toString(number);

        int finalSum = 0;
        for (int i = 0; i < numToString.length(); i++) {
            int sum = 1;
            char currentChar = numToString.charAt(i);
            int valueCurrentChar = Character.getNumericValue(currentChar);
            for (int j = 1; j <= valueCurrentChar; j++) {
                sum *= j;
            }
            finalSum += sum;
        }
        if (finalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
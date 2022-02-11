package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (secondNumber > 10) {
            System.out.printf("%d X %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        } else {
            for (int i = secondNumber; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", firstNumber, i, firstNumber * i);
            }
        }
    }
}

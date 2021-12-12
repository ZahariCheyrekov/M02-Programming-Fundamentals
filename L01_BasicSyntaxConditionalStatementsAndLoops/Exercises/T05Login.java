package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        StringBuilder password = new StringBuilder(user).reverse();

        int count = 0;
        String input = scanner.nextLine();
        while (!input.contentEquals(password)) {
            count++;
            System.out.println("Incorrect password. Try again.");
            if (count == 4) {
                System.out.printf("User %s blocked!", user);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", user);
    }
}
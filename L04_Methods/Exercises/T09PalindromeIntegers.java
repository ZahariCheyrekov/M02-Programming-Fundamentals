package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            System.out.println(checkingPalindromes(command));
            command = scanner.nextLine();
        }
    }

    private static boolean checkingPalindromes(String command) {
        StringBuilder reversed = new StringBuilder(command).reverse();
        return command.equals(reversed.toString());
    }
}
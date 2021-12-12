package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean passwordLength = findPasswordLength(password);
        if (!passwordLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean lettersDigits = checkLettersAndDigits(password);
        if (!lettersDigits) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean digits = checkDigits(password);
        if (!digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (passwordLength && lettersDigits && digits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean findPasswordLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean checkDigits(String password) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
        }
        return numberOfDigits >= 2;
    }
}
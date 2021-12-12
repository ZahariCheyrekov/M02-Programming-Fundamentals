package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class T05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            String digits = scanner.nextLine();
            int digitsLength = digits.length();
            int mainDigit = Character.getNumericValue(digits.charAt(0));
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int letterIndex = (offset + digitsLength - 1) + 97;
            char letter = (char) letterIndex;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message.append(letter);
        }
        System.out.println(message);
    }
}
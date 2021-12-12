package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");

        List<String> validNames = new ArrayList<>();
        for (String username : words) {
            if (validUsername(username)) {
                validNames.add(username);
            }
        }
        for (String username : validNames) {
            System.out.println(username);
        }
    }

    private static boolean validUsername(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
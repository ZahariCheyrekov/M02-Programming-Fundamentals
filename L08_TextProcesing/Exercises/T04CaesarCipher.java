package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.Scanner;

public class T04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = (char) (input.charAt(i) + 3);
            message.append(currentChar);
        }
        System.out.println(message);
    }
}
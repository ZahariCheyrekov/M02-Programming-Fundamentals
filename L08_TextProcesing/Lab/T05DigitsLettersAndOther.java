package M02_ProgrammingFundamentals.L08_TextProcesing.Lab;

import java.util.Scanner;

public class T05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                letters.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                digits.append(currentChar);
            } else {
                symbols.append(currentChar);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
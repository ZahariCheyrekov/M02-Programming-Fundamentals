package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        findVowels(input);
    }

    private static void findVowels(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowelsCount++;
                    break;
            }
        }
        printResult(vowelsCount);
    }

    private static void printResult(int vowelsCount) {
        System.out.println(vowelsCount);
    }
}
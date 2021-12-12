package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        findStartAndEnd(firstChar, secondChar);
    }

    private static void findStartAndEnd(char firstChar, char secondChar) {
        int start = Math.min(firstChar, secondChar);
        int end = Math.max(firstChar, secondChar);

        printCharacters(start, end);
    }

    private static void printCharacters(int start, int end) {
        for (int i = ++start; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
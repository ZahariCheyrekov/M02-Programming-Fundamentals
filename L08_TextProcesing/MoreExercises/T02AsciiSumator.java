package M02_ProgrammingFundamentals.L08_TextProcesing.MoreExercises;

import java.util.Scanner;

public class T02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charA = scanner.nextLine().charAt(0);
        char charB = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();

        int max = Math.max(charA, charB);
        int min = Math.min(charA, charB);

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar < max && currentChar > min) {
                sum += currentChar;
            }
        }
        System.out.println(sum);
    }
}
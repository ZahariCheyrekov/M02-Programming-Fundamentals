package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.Scanner;

public class T02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstString = input[0];
        String secondString = input[1];

        int min = Math.min(firstString.length(), secondString.length());

        int sumChars = 0;
        for (int i = 0; i < min; i++) {
            sumChars += firstString.charAt(i) * secondString.charAt(i);
        }
        if (firstString.length() > secondString.length()) {
            for (int i = min; i < firstString.length(); i++) {
                sumChars += firstString.charAt(i);
            }
        } else if (secondString.length() > firstString.length()) {
            for (int i = min; i < secondString.length(); i++) {
                sumChars += secondString.charAt(i);
            }
        }
        System.out.println(sumChars);
    }
}
package M02_ProgrammingFundamentals.L08_TextProcesing.Lab;

import java.util.Scanner;

public class T02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();
        for (String currentWord : words) {
            int wordLength = currentWord.length();
            for (int j = 0; j < wordLength; j++) {
                stringBuilder.append(currentWord);
            }
        }
        System.out.println(stringBuilder);
    }
}
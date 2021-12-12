package M02_ProgrammingFundamentals.L08_TextProcesing.Lab;

import java.util.Scanner;

public class T04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : bannedWords) {
            StringBuilder repeated = new StringBuilder(banWord.repeat(banWord.length())
                    .replace(banWord, "*"));
            text = text.replace(banWord, repeated);
        }
        System.out.println(text);
    }
}
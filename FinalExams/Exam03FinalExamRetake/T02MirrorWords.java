package M02_ProgrammingFundamentals.FinalExams.Exam03FinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#]|[@])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1");

        int wordsPair = 0;
        List<String> mirrorWords = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            wordsPair++;

            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");

            StringBuilder wordTwoReversed = new StringBuilder(wordTwo).reverse();

            if (wordOne.equals(wordTwoReversed.toString())) {
                mirrorWords.add(String.format("%s <=> %s", wordOne, wordTwo));
            }

        }

        if (wordsPair == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", wordsPair);
        }

        if (mirrorWords.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }
    }
}
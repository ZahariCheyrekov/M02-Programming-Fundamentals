package M02_ProgrammingFundamentals.FinalExams.Exam05FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern digitPattern = Pattern.compile("\\d");
        Matcher matcherDigit = digitPattern.matcher(input);

        long coolThreshold = 1;
        while (matcherDigit.find()) {
            coolThreshold *= Long.parseLong(matcherDigit.group());
        }

        Pattern pattern = Pattern.compile("(?<emoji>([:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})\\2)");
        Matcher matcher = pattern.matcher(input);


        List<String> coolEmojis = new ArrayList<>();
        int counterEmojis = 0;
        long coolThresholdEmoji = 0;
        while (matcher.find()) {
            counterEmojis++;
            String name = matcher.group("name");

            for (int i = 0; i < name.length(); i++) {
                coolThresholdEmoji += name.charAt(i);
            }
            if (coolThresholdEmoji > coolThreshold) {
                coolEmojis.add(matcher.group("emoji"));
            }
            coolThresholdEmoji = 0;
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counterEmojis);
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}
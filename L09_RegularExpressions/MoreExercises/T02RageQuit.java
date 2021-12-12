package M02_ProgrammingFundamentals.L09_RegularExpressions.MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(?<string>[\\D]*)(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            int n = Integer.parseInt(matcher.group("count"));
            String word = matcher.group("string").toUpperCase();
            for (int i = 0; i < n; i++) {
                sb.append(word);
            }
        }

        System.out.printf("Unique symbols used: %d%n", sb.chars().distinct().count());
        System.out.println(sb);
    }
}
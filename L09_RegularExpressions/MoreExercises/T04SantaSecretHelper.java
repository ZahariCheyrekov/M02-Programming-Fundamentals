package M02_ProgrammingFundamentals.L09_RegularExpressions.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T04SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        List<String> kids = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder currentMessage = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = (char) (input.charAt(i) - key);
                currentMessage.append(currentChar);
            }
            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@!:>-]*?!(?<type>[GN])!");
            Matcher matcher = pattern.matcher(currentMessage.toString());
            while (matcher.find()) {
                if (matcher.group("type").equals("G")) {
                    kids.add(matcher.group("name"));
                }
            }
            input = scanner.nextLine();
        }
        for (String kid : kids) {
            System.out.println(kid);
        }
    }
}
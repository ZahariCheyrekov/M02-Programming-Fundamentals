package M02_ProgrammingFundamentals.L09_RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b((?<=\\s)(?<user>[a-zA-Z0-9]+)([-._]?)(?<host>[a-zA-Z0-9]+)@([a-zA-Z0-9]+([-._][a-zA-Z]+)+))\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
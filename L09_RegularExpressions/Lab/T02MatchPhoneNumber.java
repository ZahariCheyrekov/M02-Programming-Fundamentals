package M02_ProgrammingFundamentals.L09_RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<phoneNumber>[+]359([ -])2\\2[\\d]{3}\\2[\\d]{4})\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> phoneNumbers = new ArrayList<>();
        while (matcher.find()) {
            String phoneNumber = matcher.group("phoneNumber");
            phoneNumbers.add(phoneNumber);
        }

        System.out.println(String.join(", ", phoneNumbers));
    }
}
package M02_ProgrammingFundamentals.L09_RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<date>(?<day>[\\d]{2})([\\/.-])(?<month>[A-Z][a-z]{2})\\3(?<year>[\\d]{4}))\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            dates.add(String.format("Day: %s, Month: %s, Year: %s", day, month, year));
        }

        for (String date : dates) {
            System.out.println(date);
        }
    }
}
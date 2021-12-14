package M02_ProgrammingFundamentals.FinalExams.Exam01FinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<itemName>[A-Za-z ]+)\\1(?<expirationDate>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,4})\\1");
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;
            result.append(String.format("Item: %s, Best before: %s, Nutrition: %s%n", itemName, expirationDate, calories));
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        System.out.println(String.join(System.lineSeparator(), result));
    }
}
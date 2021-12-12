package M02_ProgrammingFundamentals.FinalExams.Exam02FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1");

        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        int sum = 0;
        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            String destination = matcher.group("destination");
            destinations.add(destination);

            sum += destination.length();
        }
        System.out.printf("Destinations: %s%n", String.join(", ", destinations));
        System.out.println("Travel Points: " + sum);
    }
}
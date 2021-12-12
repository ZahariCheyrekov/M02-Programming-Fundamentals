package M02_ProgrammingFundamentals.L09_RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class T02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> results = new LinkedHashMap<>();
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        for (String participant : participants) {
            results.putIfAbsent(participant, 0);
        }

        Pattern namePattern = Pattern.compile("[A-Za-z]+");
        Pattern distancePattern = Pattern.compile("\\d");

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();

            Matcher nameMatcher = namePattern.matcher(input);
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }

            int distance = 0;
            Matcher distanceMatcher = distancePattern.matcher(input);
            while (distanceMatcher.find()) {
                distance += Integer.parseInt(distanceMatcher.group());
            }

            if (results.containsKey(String.valueOf(name))) {
                results.put(String.valueOf(name), results.get(String.valueOf(name)) + distance);
            }

            input = scanner.nextLine();
        }
        List<String> names = new ArrayList<>();

        results.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(participant -> names.add(participant.getKey()));

        System.out.printf("1st place: %s%n" +
                        "2nd place: %s%n" +
                        "3rd place: %s%n", names.get(0),
                names.get(1), names.get(2));
    }
}
package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> results = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String name = data[0];

            if (data.length == 3) {
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if (!results.containsKey(name)) {
                    results.put(name, points);
                } else if (results.get(name) < points) {
                    results.put(name, points);
                }

                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }
            } else {
                results.remove(name);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        results.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");
        submissions.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
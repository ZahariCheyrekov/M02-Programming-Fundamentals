package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> results = new LinkedHashMap<>();
        Map<String, Integer> userPoints = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String[] data = input.split("\\s+->\\s+");
            String name = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            results.putIfAbsent(contest, new LinkedHashMap<>());
            results.get(contest).putIfAbsent(name, 0);
            results.get(contest).put(name, Math.max(results.get(contest).get(name), points));

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : results.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                userPoints.putIfAbsent(entry2.getKey(), 0);
                userPoints.put(entry2.getKey(), userPoints.get(entry2.getKey()) + entry2.getValue());
            }
        }

        int[] count = new int[1];
        results.forEach((key, value) -> {
            count[0] = 0;
            System.out.printf("%s: %d participants%n", key, value.size());
            value.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(entry -> System.out.printf("%d. %s <::> %d%n", ++count[0], entry.getKey(), entry.getValue()));
        });

        count[0] = 0;
        System.out.println("Individual standings:");
        userPoints.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.printf("%d. %s -> %d%n", ++count[0], entry.getKey(), entry.getValue()));
    }
}
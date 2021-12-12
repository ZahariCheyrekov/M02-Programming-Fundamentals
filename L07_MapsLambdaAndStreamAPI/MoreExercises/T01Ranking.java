package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.MoreExercises;

import java.util.*;

public class T01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contests = new HashMap<>();
        Map<String, Map<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] data = input.split(":");
            String contest = data[0];
            String password = data[1];

            contests.put(contest, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] data = input.split("=>");
            String contest = data[0];
            String password = data[1];
            String username = data[2];
            int points = Integer.parseInt(data[3]);

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {
                    Map<String, Integer> course = new LinkedHashMap<>();
                    course.put(contest, points);

                    if (!users.containsKey(username)) {
                        users.put(username, course);
                    } else {
                        if (!users.get(username).containsKey(contest)) {
                            users.get(username).put(contest, points);
                        } else {
                            users.get(username).put(contest, Math.max(points, users.get(username).get(contest)));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        int totalSum = 0;
        String best = "";
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(x -> x).sum();
            if (sum > totalSum) {
                totalSum = sum;
                best = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", best, totalSum);

        System.out.println("Ranking:");
        users.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.entrySet()
                    .stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(student -> System.out.printf("#  %s -> %d%n", student.getKey(), student.getValue()));
        });
    }
}
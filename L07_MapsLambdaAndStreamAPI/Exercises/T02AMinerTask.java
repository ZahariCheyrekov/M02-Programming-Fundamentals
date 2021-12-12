package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> counts = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            counts.putIfAbsent(resource, 0);
            counts.put(resource, counts.get(resource) + quantity);
            input = scanner.nextLine();
        }
        counts.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
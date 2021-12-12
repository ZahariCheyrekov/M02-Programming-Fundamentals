package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class T03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String currentWord = word.toLowerCase();

            counts.putIfAbsent(currentWord, 0);
            counts.put(currentWord, counts.get(currentWord) + 1);
        }
        List<String> odds = new ArrayList<>();
        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}
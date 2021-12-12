package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class T02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int words = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> counts = new LinkedHashMap<>();
        for (int i = 1; i <= words; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            counts.putIfAbsent(word, new ArrayList<>());
            counts.get(word).add(synonym);
        }
        counts.forEach((k, v) -> System.out.printf("%s - %s%n", k,
                String.join(", ", v)));
    }
}
package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> counts = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {
                counts.putIfAbsent(currentChar, 0);
                counts.put(currentChar, counts.get(currentChar) + 1);
            }
        }
        counts.forEach((k, v) -> System.out.printf("%c -> %d%n", k, v));
    }
}
package M02_ProgrammingFundamentals.FinalExams.Exam01FinalExamRetake;

import java.util.*;

public class T03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, String>> pieces = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|+");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];

            pieces.putIfAbsent(piece, new TreeMap<>());
            pieces.get(piece).putIfAbsent(composer, key);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split("\\|+");
            String command = data[0];
            String piece = data[1];

            switch (command) {
                case "Add":
                    String composer = data[2];
                    String key = data[3];

                    if (pieces.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        pieces.put(piece, new TreeMap<>());
                        pieces.get(piece).put(composer, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (pieces.containsKey(piece)) {
                        pieces.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    if (pieces.containsKey(piece)) {
                        String composerOld = pieces.get(piece).keySet().toString().replaceAll("[\\[\\]]", "");
                        pieces.get(piece).put(composerOld, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        pieces.forEach((key, value) -> {
            System.out.printf("%s -> ", key);
            value.forEach((key1, value1) -> System.out.printf("Composer: %s, Key: %s%n", key1, value1));
        });
    }
}
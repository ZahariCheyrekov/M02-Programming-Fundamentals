package M02_ProgrammingFundamentals.MidExams.Exam06MidExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class T02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!loot.contains(tokens[i])) {
                            loot.add(0, tokens[i]);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(tokens[1]);
                    if (dropIndex >= 0 && dropIndex < loot.size()) {
                        String removed = loot.remove(dropIndex);
                        loot.add(removed);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    int stolen = 0;
                    List<String> stolenItems = new ArrayList<>();
                    for (int i = loot.size() - 1; i >= 0; i--) {
                        if (stolen == count) {
                            break;
                        } else {
                            stolenItems.add(0, loot.get(i));
                            loot.remove(i);
                        }
                        stolen++;
                    }
                    System.out.println(String.join(", ", stolenItems));
                    break;
            }
            input = scanner.nextLine();
        }
        if (loot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sumLength = 0;
            for (String current : loot) {
                double currentLength = current.length();
                sumLength += currentLength;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", sumLength / loot.size());
        }
    }
}
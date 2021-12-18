package M02_ProgrammingFundamentals.MidExams.Exam04MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine().split("!+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String item = tokens[1];
            switch (command) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    groceries.remove(item);
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (groceries.contains(item)) {
                        groceries.set(groceries.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}
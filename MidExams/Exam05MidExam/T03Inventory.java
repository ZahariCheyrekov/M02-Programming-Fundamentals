package M02_ProgrammingFundamentals.MidExams.Exam05MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            switch (command) {
                case "Collect":
                    String itemCollect = tokens[1];
                    if (!inventory.contains(itemCollect)) {
                        inventory.add(itemCollect);
                    }
                    break;
                case "Drop":
                    String dropItem = tokens[1];
                    inventory.remove(dropItem);
                    break;
                case "Combine Items":
                    String[] items = tokens[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if (inventory.contains(oldItem)) {
                        inventory.add(inventory.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = tokens[1];
                    if (inventory.contains(renewItem)) {
                        inventory.remove(renewItem);
                        inventory.add(renewItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
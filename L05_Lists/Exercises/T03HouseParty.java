package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            if (input.contains("is going")) {
                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else if (input.contains("is not going")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
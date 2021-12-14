package M02_ProgrammingFundamentals.MyMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Report")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Blacklist":
                    String name = tokens[1];
                    if (friends.contains(name)) {
                        System.out.printf("%s was blacklisted.%n", name);
                        friends.set(friends.indexOf(name), "Blacklisted");
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":
                    int indexError = Integer.parseInt(tokens[1]);
                    if (indexError >= 0 && indexError < friends.size()) {
                        String username = friends.get(indexError);
                        if (!username.equals("Blacklisted") && !username.equals("Lost")) {
                            System.out.printf("%s was lost due to an error.%n", username);
                            friends.set(indexError, "Lost");
                        }
                    }
                    break;
                case "Change":
                    int indexChange = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (indexChange >= 0 && indexChange < friends.size()) {
                        String currentName = friends.get(indexChange);
                        System.out.printf("%s changed his username to %s.%n", currentName, newName);
                        friends.set(friends.indexOf(currentName), newName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int lost = 0;
        int blackListed = 0;
        for (String name : friends) {
            if (name.equals("Blacklisted")) {
                blackListed++;
            }
            if (name.equals("Lost")) {
                lost++;
            }
        }
        System.out.printf("Blacklisted names: %d%n", blackListed);
        System.out.printf("Lost names: %d%n", lost);
        System.out.println(String.join(" ", friends));
    }
}
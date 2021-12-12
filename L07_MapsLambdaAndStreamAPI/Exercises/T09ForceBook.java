package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class T09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            String operator = "";

            if (input.contains("|")) {
                operator = "|";
            } else if (input.contains("->")) {
                operator = "->";
            }

            switch (operator) {
                case "|":
                    String[] data = input.split("\\s+\\|\\s+");
                    String side = data[0];
                    String user = data[1];

                    boolean exist = false;
                    for (Map.Entry<String, List<String>> current : users.entrySet()) {
                        if (current.getValue().contains(user)) {
                            exist = true;
                            break;
                        }
                    }

                    if (!exist) {
                        users.putIfAbsent(side, new ArrayList<>());
                        users.get(side).add(user);
                    }

                    break;
                case "->":
                    String[] tokens = input.split("\\s+->\\s+");
                    String forceUser = tokens[0];
                    String forceSide = tokens[1];

                    for (Map.Entry<String, List<String>> current : users.entrySet()) {
                        if (current.getValue().contains(forceUser)) {
                            users.get(current.getKey()).remove(forceUser);
                            break;
                        }
                    }

                    if (!users.containsKey(forceSide)) {
                        users.put(forceSide, new ArrayList<>());
                        users.get(forceSide).add(forceUser);
                        System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                    } else if (users.containsKey(forceSide) && !users.get(forceSide).contains(forceUser)) {
                        users.get(forceSide).add(forceUser);
                        System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        users.entrySet()
                .stream()
                .filter(user -> user.getValue().size() > 0)
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue()
                            .stream()
                            .sorted()
                            .forEach(value -> System.out.printf("! %s%n", value));
                });
    }
}
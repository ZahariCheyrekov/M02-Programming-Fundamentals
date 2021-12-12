package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();

        int people = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < people; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];

            switch (command) {
                case "register":
                    String licensePlate = data[2];
                    if (users.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                    } else {
                        users.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    }
                    break;
                case "unregister":
                    if (!users.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        users.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        users.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
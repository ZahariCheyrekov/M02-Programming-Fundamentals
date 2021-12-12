package M02_ProgrammingFundamentals.MyFinalExam;

import java.util.Scanner;

public class T01Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Abracadabra")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Abjuration":
                    String current = message.toString().toUpperCase();
                    message = new StringBuilder(current);
                    System.out.println(message);
                    break;
                case "Necromancy":
                    String currentLower = message.toString().toLowerCase();
                    message = new StringBuilder(currentLower);
                    System.out.println(message);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(data[1]);
                    String letter = data[2];

                    if (index >= 0 && index < message.length()) {
                        message.replace(index, index + 1, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String first = data[1];
                    String second = data[2];

                    String currentMessage = message.toString();
                    if (currentMessage.contains(first)) {
                        currentMessage = currentMessage.replace(first, second);
                        message = new StringBuilder(currentMessage);
                        System.out.println(message);
                    }
                    break;
                case "Alteration":
                    String substring = data[1];

                    if (message.toString().contains(substring)) {
                        String messageRes = message.toString().replace(substring, "");
                        message = new StringBuilder(messageRes);
                        System.out.println(messageRes);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }

            input = scanner.nextLine();
        }
    }
}
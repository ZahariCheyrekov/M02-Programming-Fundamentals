package M02_ProgrammingFundamentals.FinalExams.Exam05FinalExam;

import java.util.Scanner;

public class T01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] data = input.split(">>>");
            String command = data[0];

            switch (command) {
                case "Contains":
                    String substring = data[1];

                    if (message.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", message, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperLower = data[1];
                    int start = Integer.parseInt(data[2]);
                    int end = Integer.parseInt(data[3]);

                    String changed = message.substring(start, end);
                    switch (upperLower) {
                        case "Upper":
                            changed = changed.toUpperCase();
                            break;
                        case "Lower":
                            changed = changed.toLowerCase();
                            break;
                    }
                    message.replace(start, end, changed);
                    System.out.println(message);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    message.delete(startIndex, endIndex);

                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + message);
    }
}
package M02_ProgrammingFundamentals.FinalExams.Exam03FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Pattern;

public class T01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = data[1];

                    if (message.toString().contains(substring)) {
                        String stringBuilder = new StringBuilder(substring).reverse().toString();
                        String newText = message.toString().replaceFirst(Pattern.quote(substring), "") + stringBuilder;
                        message = new StringBuilder(newText);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringOld = data[1];
                    String replacement = data[2];

                    String replaced = message.toString().replace(substringOld, replacement);
                    message = new StringBuilder(replaced);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", message);
    }
}
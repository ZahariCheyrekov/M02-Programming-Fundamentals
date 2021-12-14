package M02_ProgrammingFundamentals.FinalExams.Exam01FinalExamRetake;

import java.util.Scanner;

public class T01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] data = input.split("\\|+");
            String command = data[0];

            switch (command) {
                case "Move":
                    int letters = Integer.parseInt(data[1]);
                    String moved = message.substring(0, letters);
                    message.delete(0, letters).append(moved);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    message.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];

                    String messageToString = message.toString();
                    messageToString = messageToString.replace(substring, replacement);
                    message = new StringBuilder(messageToString);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}
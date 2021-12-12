package M02_ProgrammingFundamentals.FinalExams.Exam04FinalExam;

import java.util.Scanner;

public class T01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();

                    for (int i = 1; i < message.length(); i += 2) {
                        newPassword.append(message.charAt(i));
                    }
                    message = newPassword;
                    System.out.println(message);
                    break;
                case "Cut":
                    int indexCut = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);

                    message.delete(indexCut, indexCut + length);
                    System.out.println(message);
                    break;
                case "Substitute":
                    String substring = data[1];
                    String substitute = data[2];

                    String current = message.toString();
                    if (current.contains(substring)) {
                        current = current.replace(substring, substitute);
                        message = new StringBuilder(current);
                        System.out.println(message);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + message);
    }
}
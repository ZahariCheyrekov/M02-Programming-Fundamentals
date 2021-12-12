package M02_ProgrammingFundamentals.FinalExams.Exam02FinalExam;

import java.util.Scanner;

public class T01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] data = input.split(":");
            String command = data[0];

            switch (command) {
                case "Add Stop":
                    int indexAdd = Integer.parseInt(data[1]);
                    String string = data[2];
                    if (indexAdd >= 0 && indexAdd < message.length()) {
                        message.insert(indexAdd, string);
                    }
                    System.out.println(message);
                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);

                    if (start >= 0 && end < message.length()) {
                        message.delete(start, end + 1);
                    }
                    System.out.println(message);
                    break;
                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];

                    String currentMessage = message.toString().replace(oldString, newString);
                    message = new StringBuilder(currentMessage);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", message);
    }
}
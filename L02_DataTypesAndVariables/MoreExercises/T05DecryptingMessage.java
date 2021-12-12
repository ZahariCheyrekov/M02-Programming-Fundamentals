package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class T05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int characters = Integer.parseInt(scanner.nextLine());

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < characters; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            char result = (char) (currentChar + key);
            message.append(result);
        }
        System.out.println(message);
    }
}
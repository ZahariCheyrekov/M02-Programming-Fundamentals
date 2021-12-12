package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class T01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Scanner type = new Scanner(input);
            if (type.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            } else if (type.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (type.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            } else if (type.hasNextLine()) {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }

    }
}
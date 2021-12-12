package M02_ProgrammingFundamentals.L08_TextProcesing.MoreExercises;

import java.util.Scanner;

public class T01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= people; i++) {
            String input = scanner.nextLine();
            int firstIndex = input.indexOf("@");
            int secondIndex = input.indexOf("|");
            String name = input.substring(firstIndex + 1, secondIndex);

            int nameFirstIndex = input.indexOf("#");
            int nameSecondIndex = input.indexOf("*");
            String age = input.substring(nameFirstIndex + 1, nameSecondIndex);

            System.out.printf("%s is %s years old.\n", name, age);
        }
    }
}
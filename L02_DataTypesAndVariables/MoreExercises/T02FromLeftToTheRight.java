package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class T02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            long leftPart = Long.parseLong(parts[0]);
            long rightPart = Long.parseLong(parts[1]);
            long max = Math.max(leftPart, rightPart);

            int sumDigits = 0;
            while (max != 0) {
                sumDigits += max % 10;
                max /= 10;
            }
            System.out.println(Math.abs(sumDigits));
        }
    }
}
package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int end = number + 97;
        for (int i = 97; i < end; i++) {
            for (int j = 97; j < end; j++) {
                for (int k = 97; k < end; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printMatrix(number);
    }

    private static void printMatrix(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T03PrintingTriangle {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
       
        printTriangle(number);
    }

    private static void printTriangle(int number) {
        printUpperPart(number);
        printLowerPart(number);
    }

    private static void printUpperPart(int number) {
        for (int i = 1; i <= number; i++) {
            printSingleLine(i);
        }
    }

    private static void printLowerPart(int number) {
        for (int i = number - 1; i >= 1; i--) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        
        System.out.println();
    }
}

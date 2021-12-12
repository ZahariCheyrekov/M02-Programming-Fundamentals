package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concat = scanner.nextLine() +
                scanner.nextLine() +
                scanner.nextLine();
        System.out.println(concat);
    }
}
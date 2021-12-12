package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.io.IOException;
import java.util.Scanner;

public class T08LowerOrUpper {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char currentChar = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(currentChar)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
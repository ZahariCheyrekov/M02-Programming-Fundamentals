package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            message.append(scanner.nextLine()).append(" ");
        }
        System.out.println(message.reverse());
    }
}
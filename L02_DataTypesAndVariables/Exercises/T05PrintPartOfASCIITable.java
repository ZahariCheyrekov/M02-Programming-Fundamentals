package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            char currentChar = (char) i;
            result.append(currentChar).append(" ");
        }
        System.out.println(result);
    }
}
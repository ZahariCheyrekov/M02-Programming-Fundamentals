package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class T06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int openingBrackets = 0;
        int closingBrackets = 0;

        for (int i = 1; i <= lines; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openingBrackets++;
            } else if (input.equals(")")) {
                closingBrackets++;
            }

            if (closingBrackets > openingBrackets) {
                break;
            }
        }
        if (openingBrackets == closingBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
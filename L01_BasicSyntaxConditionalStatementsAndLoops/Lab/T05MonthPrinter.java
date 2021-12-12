package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T05MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        if (month < 1 || month > 12) {
            System.out.println("Error!");
        } else {
            System.out.println(months[month - 1]);
        }
    }
}
package M02_ProgrammingFundamentals.L08_TextProcesing.Lab;

import java.util.Scanner;

public class T01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder stringBuilder = new StringBuilder(input).reverse();
            System.out.printf("%s = %s%n", input, stringBuilder);
            input = scanner.nextLine();
        }
    }
}
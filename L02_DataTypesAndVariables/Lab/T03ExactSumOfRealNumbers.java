package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class T03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal("0");
        for (int i = 1; i <= numbers; i++) {
            BigDecimal bd = new BigDecimal(scanner.nextLine());
            sum = sum.add(bd);
        }
        System.out.println(sum);
    }
}
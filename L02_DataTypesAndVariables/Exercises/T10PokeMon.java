package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double nHalfValue = n * 0.50;

        int targets = 0;
        while (n >= m) {
            targets++;
            n -= m;
            if (n == nHalfValue) {
                if (y != 0) {
                    n /= y;
                }
            }
        }
        System.out.println(n);
        System.out.println(targets);
    }
}
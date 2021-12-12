package M02_ProgrammingFundamentals.MyMidExam;

import java.util.Scanner;

public class T01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        for (int i = 1; i <= cities; i++) {
            String cityName = scanner.nextLine();
            double moneyEarned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 5 == 0) {
                moneyEarned *= 0.90;
            } else if (i % 3 == 0) {
                expenses = expenses + expenses * 0.50;
            }

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, moneyEarned - expenses);
            totalProfit += moneyEarned - expenses;
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
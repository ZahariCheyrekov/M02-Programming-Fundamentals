package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        findPrice(product, quantity);
    }

    private static void findPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = quantity * 1.50;
                break;
            case "water":
                price = quantity * 1.00;
                break;
            case "coke":
                price = quantity * 1.40;
                break;
            case "snacks":
                price = quantity * 2.00;
                break;
        }
        printResult(price);
    }

    private static void printResult(double price) {
        System.out.printf("%.2f", price);
    }
}
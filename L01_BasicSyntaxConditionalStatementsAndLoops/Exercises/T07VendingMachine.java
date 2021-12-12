package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1) {
                money += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            double productPrice = 0;
            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    if (money < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        money -= productPrice;
                    }
                    break;
                case "Water":
                    productPrice = 0.7;
                    if (money < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        money -= productPrice;
                    }
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    if (money < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        money -= productPrice;
                    }
                    break;
                case "Soda":
                    productPrice = 0.8;
                    if (money < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        money -= productPrice;
                    }
                    break;
                case "Coke":
                    productPrice = 1.0;
                    if (money < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        money -= productPrice;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}
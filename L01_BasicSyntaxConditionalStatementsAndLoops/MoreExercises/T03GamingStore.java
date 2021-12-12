package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class T03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());

        double moneySpent = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            double price = 0;
            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }
            if (price <= balance) {
                System.out.printf("Bought %s%n", input);
                balance -= price;
                moneySpent += price;
            } else {
                System.out.println("Too Expensive");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, balance);
    }
}
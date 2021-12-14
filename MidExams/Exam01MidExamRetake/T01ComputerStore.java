package M02_ProgrammingFundamentals.MidExams.Exam01MidExamRetake;

import java.util.Scanner;

public class T01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;

        String input = scanner.nextLine();
        while (!input.equals("special") && !input.equals("regular")) {
            double money = Double.parseDouble(input);
            if (money > 0) {
                price += money;
            } else {
                System.out.println("Invalid price!");
            }
            input = scanner.nextLine();
        }
        double taxes = price * 0.20;
        double finalSum = taxes + price;
        if (input.equals("special")) {
            finalSum *= 0.90;
        }
        if (finalSum == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    " Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$%n", price, taxes, finalSum);
        }
    }
}
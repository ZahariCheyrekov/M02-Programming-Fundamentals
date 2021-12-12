package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                switch (typeGroup) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (typeGroup) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (typeGroup) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = price * people;
        if (typeGroup.equals("Students")) {
            if (people >= 30) {
                totalPrice *= 0.85;
            }
        } else if (typeGroup.equals("Business")) {
            if (people >= 100) {
                totalPrice -= 10 * price;
            }
        } else if (typeGroup.equals("Regular")) {
            if (people >= 10 && people <= 20) {
                totalPrice *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
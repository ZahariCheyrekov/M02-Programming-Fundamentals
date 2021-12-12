package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        switch (typeDay) {
            case "Weekday":
                if (age < 19) {
                    price = 12;
                } else if (age < 65) {
                    price = 18;
                } else if (age < 123) {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age < 19) {
                    price = 15;
                } else if (age < 65) {
                    price = 20;
                } else if (age < 123) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age < 19) {
                    price = 5;
                } else if (age < 65) {
                    price = 12;
                } else if (age < 123) {
                    price = 10;
                }
                break;
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
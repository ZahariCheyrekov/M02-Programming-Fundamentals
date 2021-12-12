package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double sabersPrice = Math.ceil(students + (students * 0.10));
        double robesPrice = robes * students;
        double beltsPrice = belts * (students - (students / 6));
        double totalPrice = (lightSabers * sabersPrice) + robesPrice + beltsPrice;

        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - amountOfMoney);
        }
    }
}
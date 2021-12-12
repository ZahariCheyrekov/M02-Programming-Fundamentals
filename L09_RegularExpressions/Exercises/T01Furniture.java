package M02_ProgrammingFundamentals.L09_RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile
                ("(?<furniture>(>>)(?<furnitureName>[A-Za-z]+)(<<)(?<price>[\\d]+\\.?[\\d]+)!(?<quantity>[\\d]+))");

        List<String> boughtFurniture = new ArrayList<>();
        double totalPrice = 0;

        String input = scanner.nextLine();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice += price * quantity;
                boughtFurniture.add(furnitureName);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String current : boughtFurniture) {
            System.out.println(current);
        }
        System.out.printf("Total money spend: %.2f%n", totalPrice);
    }
}
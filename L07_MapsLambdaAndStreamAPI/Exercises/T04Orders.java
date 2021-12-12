package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] data = input.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!products.containsKey(product)) {
                products.put(product, price * quantity);
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
                products.put(product, productsQuantity.get(product) * price);
            }
            input = scanner.nextLine();
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}
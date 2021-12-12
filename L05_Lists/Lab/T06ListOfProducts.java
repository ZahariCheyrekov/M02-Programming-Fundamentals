package M02_ProgrammingFundamentals.L05_Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int products = Integer.parseInt(scanner.nextLine());

        readAndOrder(products, scanner);
    }

    private static void readAndOrder(int products, Scanner scanner) {
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < products; i++) {
            productsList.add(scanner.nextLine());
        }
        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));
        }
    }
}
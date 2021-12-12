package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double biggestVolume = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < kegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
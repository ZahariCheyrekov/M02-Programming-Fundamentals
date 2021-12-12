package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class T09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int spiceAmount = 0;
        while (yield >= 100) {
            days++;
            spiceAmount += yield - 26;
            yield -= 10;
        }
        if (spiceAmount >= 26) {
            spiceAmount -= 26;
        }
        System.out.println(days);
        System.out.println(spiceAmount);
    }
}
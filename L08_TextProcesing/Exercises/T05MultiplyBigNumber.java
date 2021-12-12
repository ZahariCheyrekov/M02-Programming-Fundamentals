package ProgramminFundamentals.TextProcesing.Exercises;

import java.util.Scanner;

public class T05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNum = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder finalResult = new StringBuilder();
        int decimalReminder = 0;

        if (bigNum.isEmpty()) {
            bigNum = "0";
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int number = (int) bigNum.charAt(i) - 48;
            int currentSum = number * n;
            currentSum += decimalReminder;
            finalResult.append(currentSum % 10);
            decimalReminder = currentSum / 10;
        }

        if (decimalReminder > 0) {
            finalResult.append(decimalReminder);
        }
        System.out.println(finalResult.reverse());
    }
}
package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());
        repeatString(text, repeatTimes);
    }

    private static void repeatString(String text, int repeatTimes) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 1; i <= repeatTimes; i++) {
            repeated.append(text);
        }
        printResult(repeated);
    }

    private static void printResult(StringBuilder repeated) {
        System.out.println(repeated);
    }
}
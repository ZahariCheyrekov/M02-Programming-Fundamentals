package M02_ProgrammingFundamentals.L04_Methods.Lab;

import java.util.Scanner;

public class T09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                getMaxInt(firstNumber, secondNumber);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                getMaxChar(firstChar, secondChar);
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                findBiggerString(firstText, secondText);
                break;
        }
    }

    private static void getMaxInt(int firstNumber, int secondNumber) {
        int biggerNumber = Math.max(firstNumber, secondNumber);
        printResult(biggerNumber);
    }

    private static void getMaxChar(char firstChar, char secondChar) {
        int biggerChar = Math.max(firstChar, secondChar);
        printChar(biggerChar);
    }

    private static void printChar(int biggerChar) {
        System.out.printf("%c", biggerChar);
    }

    private static void findBiggerString(String firstText, String secondText) {
        String biggerString;
        if (firstText.compareTo(secondText) >= 0) {
            biggerString = firstText;
        } else {
            biggerString = secondText;
        }
        printResult(biggerString);
    }

    private static void printResult(int biggerNumber) {
        System.out.println(biggerNumber);
    }

    private static void printResult(String biggerString) {
        System.out.println(biggerString);
    }
}
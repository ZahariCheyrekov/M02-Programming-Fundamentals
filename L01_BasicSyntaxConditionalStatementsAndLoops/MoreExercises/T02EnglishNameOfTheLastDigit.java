package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class T02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int latDigit = number % 10;
        String digit = "";
        switch (latDigit) {
            case 0:
                digit = "zero";
                break;
            case 1:
                digit = "one";
                break;
            case 2:
                digit = "two";
                break;
            case 3:
                digit = "three";
                break;
            case 4:
                digit = "four";
                break;
            case 5:
                digit = "five";
                break;
            case 6:
                digit = "six";
                break;
            case 7:
                digit = "seven";
                break;
            case 8:
                digit = "eight";
                break;
            case 9:
                digit = "nine";
                break;
        }
        System.out.println(digit);
    }
}
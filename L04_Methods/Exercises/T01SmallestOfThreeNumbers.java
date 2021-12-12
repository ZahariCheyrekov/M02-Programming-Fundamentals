package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        findSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    private static void findSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallest = firstNumber;
        if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            smallest = secondNumber;
        } else if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            smallest = thirdNumber;
        }
        printNumber(smallest);
    }

    private static void printNumber(int smallest) {
        System.out.println(smallest);
    }
}
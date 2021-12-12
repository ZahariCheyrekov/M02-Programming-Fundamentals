package M02_ProgrammingFundamentals.L02_DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class T03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean areEqual = Math.abs(firstNumber - secondNumber) < eps;
        if (areEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
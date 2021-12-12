package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class T04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder reversed = new StringBuilder(scanner.nextLine()).reverse();
        System.out.println(reversed);
    }
}
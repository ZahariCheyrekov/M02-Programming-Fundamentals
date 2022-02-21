package M02_ProgrammingFundamentals.L04_Methods.Exercises;

import java.util.Scanner;

public class T06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String input = scanner.nextLine();
        
        String result = printMiddlePart(input);
        System.out.println(result);
    }

    private static String printMiddlePart(String input) {
        String result = "";

        if (input.length() % 2 == 1) {
            result = input.charAt(input.length() / 2) + "";
        } else {
            result = input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2);
        }
        
        return result;
    }
}

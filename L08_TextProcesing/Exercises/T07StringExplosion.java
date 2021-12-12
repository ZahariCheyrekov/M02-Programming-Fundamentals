package ProgramminFundamentals.TextProcesing.Exercises;

import java.util.Scanner;

public class T07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] texts = input.split(">");
        int strength = 0;
        int strengthLeft = 0;

        for (int i = 0; i < texts.length; i++) {
            if (Character.isDigit(texts[i].charAt(0))) {
                strength = Character.getNumericValue(texts[i].charAt(0)) + strengthLeft;

                if (texts[i].length() >= strength) {
                    texts[i] = texts[i].substring(strength);
                } else {
                    strengthLeft = strength - texts[i].length();
                    texts[i] = "";
                }
            }
            if (i == texts.length - 1) {
                System.out.print(texts[i]);
            } else {
                System.out.print(texts[i] + ">");
            }
        }
    }
}
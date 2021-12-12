package M02_ProgrammingFundamentals.L08_TextProcesing.Lab;

import java.util.Scanner;

public class T03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(word);
        while (index != -1) {
            text = text.replace(word, "");
            index = text.indexOf(word);
        }
        System.out.println(text);
    }
}
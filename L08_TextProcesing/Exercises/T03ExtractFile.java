package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.Scanner;

public class T03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int fileIndex = input.lastIndexOf("\\");
        input = input.substring(fileIndex + 1);
        int secondIndex = input.lastIndexOf(".");
        String fileName = input.substring(0, secondIndex);
        String extension = input.substring(secondIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
package M02_ProgrammingFundamentals.FinalExams.Exam04FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\@\\#+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])\\@\\#+");
        Pattern pattern1 = Pattern.compile("\\d+");

        int barcodes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < barcodes; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            Matcher matcher1 = pattern1.matcher(input);
            StringBuilder group = new StringBuilder();

            if (matcher.find()) {
                while (matcher1.find()) {
                    group.append(matcher1.group());
                }
                if (group.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
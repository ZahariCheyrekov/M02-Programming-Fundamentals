package M02_ProgrammingFundamentals.L08_TextProcesing.MoreExercises;

import java.util.Scanner;

public class T05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleTittle = scanner.nextLine();
        String contentOfTheArticle = scanner.nextLine();

        System.out.println("<h1>");
        System.out.println("    " + articleTittle);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("    " + contentOfTheArticle);
        System.out.println("</article>");

        String command = scanner.nextLine();
        while (!command.equals("end of comments")) {
            System.out.println("<div>");
            System.out.println("    " + command);
            System.out.println("</div>");
            command = scanner.nextLine();
        }
    }
}
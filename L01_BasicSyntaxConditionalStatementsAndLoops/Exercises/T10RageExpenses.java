package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class T10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrash = lostGames / 2;
        int mouseTrash = lostGames / 3;
        int keyboardTrash = lostGames / 6;
        int displayTrash = lostGames / 12;

        double totalRageExpenses = (headsetPrice * headsetTrash) + (mousePrice * mouseTrash) +
                (keyboardPrice * keyboardTrash) + (displayPrice * displayTrash);

        System.out.printf("Rage expenses: %.2f lv.", totalRageExpenses);
    }
}
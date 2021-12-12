package M02_ProgrammingFundamentals.L01_BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class T04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTime = (hours * 60) + minutes + 30;

        int hoursTime = totalTime / 60;
        int minutesTime = totalTime % 60;

        if (hoursTime > 23) {
            hoursTime = 0;
        }
        System.out.printf("%d:%02d", hoursTime, minutesTime);
    }
}
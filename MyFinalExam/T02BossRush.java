package M02_ProgrammingFundamentals.MyFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\|(?<bossName>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#");


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            boolean find = false;
            while (matcher.find()) {
                find = true;

                String bossName = matcher.group("bossName");
                String role = matcher.group("title");
                int strength = bossName.length();
                int armor = role.length();

                System.out.printf("%s, The %s%n", bossName, role);
                System.out.printf(">> Strength: %d%n", strength);
                System.out.printf(">> Armor: %d%n", armor);
            }
            if (!find) {
                System.out.println("Access denied!");
            }
        }
    }
}
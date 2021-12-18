package M02_ProgrammingFundamentals.MidExams.Exam05MidExam;

import java.util.Scanner;

public class T02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dungeonRoom = scanner.nextLine().split("\\|+");
        int initialHealth = 100;
        int bitcoins = 0;

        for (int i = 0; i < dungeonRoom.length; i++) {
            String[] tokens = dungeonRoom[i].split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "potion":
                    int healing = Integer.parseInt(tokens[1]);
                    initialHealth += healing;
                    if (initialHealth > 100) {
                        healing -= initialHealth - 100;
                        initialHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", healing);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    int bitcoinsQuantity = Integer.parseInt(tokens[1]);
                    bitcoins += bitcoinsQuantity;
                    System.out.printf("You found %d bitcoins.%n", bitcoinsQuantity);
                    break;
                default:
                    int monsterAttack = Integer.parseInt(tokens[1]);
                    initialHealth -= monsterAttack;
                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    }
                    break;
            }
        }
        System.out.printf("You've made it!%n" +
                "Bitcoins: %d%n" +
                "Health: %d", bitcoins, initialHealth);
    }
}
package M02_ProgrammingFundamentals.MidExams.Exam06MidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class T03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">+")).mapToInt(Integer::parseInt).toArray();
        int[] warship = Arrays.stream(scanner.nextLine().split(">+")).mapToInt(Integer::parseInt).toArray();
        int maxHP = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Fire":
                    int fireIndex = Integer.parseInt(tokens[1]);
                    int fireDamage = Integer.parseInt(tokens[2]);
                    if (fireIndex >= 0 && fireIndex < warship.length) {
                        warship[fireIndex] -= fireDamage;
                        if (warship[fireIndex] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int damage = Integer.parseInt(tokens[3]);
                    if (startIndex >= 0 && startIndex < pirateShip.length &&
                            endIndex >= 0 && endIndex < pirateShip.length) {
                        int start = Math.min(startIndex, endIndex);
                        int end = Math.max(startIndex, endIndex);
                        for (int i = start; i <= end; i++) {
                            pirateShip[i] -= damage;
                            if (pirateShip[i] <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int indexRepair = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);
                    if (indexRepair >= 0 && indexRepair < pirateShip.length) {
                        pirateShip[indexRepair] += health;
                        if (pirateShip[indexRepair] > maxHP) {
                            pirateShip[indexRepair] = maxHP;
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < maxHP * 0.20) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }
            input = scanner.nextLine();
        }
        int pirateShipSum = 0;
        for (int current : pirateShip) {
            pirateShipSum += current;
        }
        int warshipSum = 0;
        for (int current : warship) {
            warshipSum += current;
        }
        System.out.printf("Pirate ship status: %d%n", pirateShipSum);
        System.out.printf("Warship status: %d", warshipSum);
    }
}
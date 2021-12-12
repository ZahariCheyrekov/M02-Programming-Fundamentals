package M02_ProgrammingFundamentals.L09_RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        int messages = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= messages; i++) {
            String message = scanner.nextLine();

            Pattern starPattern = Pattern.compile("[starSTAR]");
            Matcher starMatcher = starPattern.matcher(message);

            int keys = 0;
            while (starMatcher.find()) {
                keys++;
            }

            StringBuilder decryptedMessage = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                char currentChar = (char) (message.charAt(j) - keys);
                decryptedMessage.append(currentChar);
            }

            Pattern planetPattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[\\d]+)![^@!:>-]*(?<attackType>[DA])![^@!:>-]*->(?<soldiers>[\\d]+)");
            Matcher planetMatcher = planetPattern.matcher(decryptedMessage.toString());
            while (planetMatcher.find()) {
                String planet = planetMatcher.group("planet");
                String attackType = planetMatcher.group("attackType");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planet);
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        if (attackedPlanets.size() > 0) {
            Collections.sort(attackedPlanets);
            for (String planet : attackedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        if (destroyedPlanets.size() > 0) {
            Collections.sort(destroyedPlanets);
            for (String planet : destroyedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }
    }
}
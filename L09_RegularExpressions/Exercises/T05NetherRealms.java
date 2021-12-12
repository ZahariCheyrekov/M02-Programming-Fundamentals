package M02_ProgrammingFundamentals.L09_RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> demonsMap = new TreeMap<>();

        String[] demons = scanner.nextLine().split(",\\s*");
        for (String currentDemon : demons) {
            String demon = currentDemon.replaceAll("\\s+", "");

            Pattern healthPattern = Pattern.compile("[^0-9+\\-*\\/\\.]");
            Matcher healthMatcher = healthPattern.matcher(demon);
            double demonHealth = 0;
            while (healthMatcher.find()) {
                String currentChar = healthMatcher.group();
                char symbol = currentChar.charAt(0);
                demonHealth += symbol;
            }

            Pattern patternDamage = Pattern.compile("(?<operator>[+-]?)(?<digit>\\d+\\.?\\d*)");
            Matcher matcherDamage = patternDamage.matcher(demon);

            double realDamage = 0;

            while (matcherDamage.find()) {
                String operator = matcherDamage.group("operator");
                double digit = Double.parseDouble(matcherDamage.group("digit"));
                if (operator.equals("-")) {
                    realDamage -= digit;
                } else {
                    realDamage += digit;
                }
            }

            Pattern patternAdditionalDamage = Pattern.compile("[*\\/]");
            Matcher matcherAdditionalDamage = patternAdditionalDamage.matcher(demon);
            while (matcherAdditionalDamage.find()) {
                String additionalDamage = matcherAdditionalDamage.group();
                char current = additionalDamage.charAt(0);
                if (current == ('*')) {
                    realDamage *= 2;
                } else {
                    realDamage /= 2;
                }
            }
            demonsMap.putIfAbsent(demon, new ArrayList<>(Arrays.asList(0.0, 0.0)));
            demonsMap.get(demon).set(0, demonHealth);

            demonsMap.get(demon).set(1, realDamage);
        }

        demonsMap.forEach((key, value) -> System.out.printf("%s - %.0f health, %.2f damage%n",
                key, value.get(0), value.get(1)));
    }
}
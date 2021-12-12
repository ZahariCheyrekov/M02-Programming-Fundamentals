package M02_ProgrammingFundamentals.FinalExams.Exam04FinalExam;

import java.util.*;

public class T03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hpMap = new TreeMap<>();
        Map<String, Integer> mpMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String hero = data[0];
            int hp = Integer.parseInt(data[1]);
            int mp = Integer.parseInt(data[2]);

            if (hp > 100) {
                hp = 100;
            }
            if (mp > 200) {
                mp = 200;
            }

            hpMap.put(hero, hp);
            mpMap.put(hero, mp);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" - ");
            String command = data[0];
            String heroName = data[1];

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(data[2]);
                    String spellName = data[3];

                    if (mpMap.get(heroName) >= mpNeeded) {
                        mpMap.put(heroName, mpMap.get(heroName) - mpNeeded);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, mpMap.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int takeDamage = Integer.parseInt(data[2]);
                    String attacker = data[3];

                    hpMap.put(heroName, hpMap.get(heroName) - takeDamage);
                    if (hpMap.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, takeDamage, attacker, hpMap.get(heroName));
                    } else {
                        hpMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(data[2]);

                    int currentMP = mpMap.get(heroName);
                    int recharged = currentMP + rechargeAmount;

                    if (recharged > 200) {
                        rechargeAmount = (recharged - 200) - rechargeAmount;
                        recharged = 200;
                    }
                    mpMap.put(heroName, recharged);
                    System.out.printf("%s recharged for %d MP!%n", heroName, Math.abs(rechargeAmount));
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(data[2]);

                    int currentHP = hpMap.get(heroName);
                    int healed = currentHP + healAmount;

                    if (healed > 100) {
                        healAmount = (healed - 100) - healAmount;
                        healed = 100;
                    }
                    hpMap.put(heroName, healed);
                    System.out.printf("%s healed for %d HP!%n", heroName, Math.abs(healAmount));
                    break;
            }
            input = scanner.nextLine();
        }

        hpMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> {
                    String name = entry.getKey();
                    int mp = mpMap.get(name);
                    System.out.println(entry.getKey());
                    System.out.printf("  HP: %d%n", entry.getValue());
                    System.out.printf("  MP: %d%n", mp);
                });
    }
}
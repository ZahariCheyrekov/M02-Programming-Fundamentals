package M02_ProgrammingFundamentals.L07_MapsLambdaAndStreamAPI.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> players = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Season end")) {
            String operator = "";
            if (input.contains("->")) {
                operator = "->";
            } else if (input.contains("vs")) {
                operator = "vs";
            }

            switch (operator) {
                case "->":
                    String[] data = input.split("\\s+->\\s+");
                    String player = data[0];
                    String position = data[1];
                    int skill = Integer.parseInt(data[2]);

                    players.putIfAbsent(player, new LinkedHashMap<>());
                    players.get(player).putIfAbsent(position, skill);

                    if (players.get(player).get(position) < skill) {
                        players.get(player).put(position, skill);
                    }
                    break;
                case "vs":
                    String[] currentPlayers = input.split("\\s+vs\\s+");
                    String firstPlayer = currentPlayers[0];
                    String secondPlayer = currentPlayers[1];

                    boolean hasCommon = false;
                    if (players.containsKey(firstPlayer) && players.containsKey(secondPlayer)) {
                        for (String playerA : players.get(firstPlayer).keySet()) {
                            for (String playerB : players.get(secondPlayer).keySet()) {
                                if (playerA.equals(playerB)) {
                                    hasCommon = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (hasCommon) {
                        if (players.get(firstPlayer).values().stream().mapToInt(n -> n).sum() >
                                players.get(secondPlayer).values().stream().mapToInt(n -> n).sum()) {
                            players.remove(secondPlayer);
                        } else if (players.get(firstPlayer).values().stream().mapToInt(n -> n).sum() <
                                players.get(secondPlayer).values().stream().mapToInt(n -> n).sum()) {
                            players.remove(firstPlayer);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        players.entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(),
                            p1.getValue().values().stream().mapToInt(i -> i).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int res = Integer.compare(e2.getValue(), e1.getValue());
                                if (res == 0) {
                                    res = e1.getKey().compareTo(e2.getKey());
                                }
                                return res;
                            })
                            .forEach(e -> System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue()));
                });
    }
}
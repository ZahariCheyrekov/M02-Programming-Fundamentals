package M02_ProgrammingFundamentals.L05_Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T09PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distanceToPokemon = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        int removedSum = 0;
        while (distanceToPokemon.size() > 0) {
            int indexToRemove = 0;
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                indexToRemove = distanceToPokemon.remove(0);
                removedSum += indexToRemove;
                distanceToPokemon.add(0, distanceToPokemon.get(distanceToPokemon.size() - 1));
            } else if (index > distanceToPokemon.size() - 1) {
                indexToRemove = distanceToPokemon.remove(distanceToPokemon.size() - 1);
                removedSum += indexToRemove;
                distanceToPokemon.add(distanceToPokemon.get(0));
            } else {
                indexToRemove = distanceToPokemon.remove(index);
                removedSum += indexToRemove;
            }
            for (int i = 0; i < distanceToPokemon.size(); i++) {
                if (distanceToPokemon.get(i) <= indexToRemove) {
                    distanceToPokemon.set(i, distanceToPokemon.get(i) + indexToRemove);
                } else {
                    distanceToPokemon.set(i, distanceToPokemon.get(i) - indexToRemove);
                }
            }
        }
        System.out.println(removedSum);
    }
}
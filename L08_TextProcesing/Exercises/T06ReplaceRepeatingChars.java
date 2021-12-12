package M02_ProgrammingFundamentals.L08_TextProcesing.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> characterList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        for (int i = 1; i < characterList.size(); i++) {
            String previous = characterList.get(i - 1);
            String current = characterList.get(i);
            if (current.equals(previous)) {
                characterList.remove(i);
                i--;
            }
        }
        System.out.println(String.join("", characterList));
    }
}
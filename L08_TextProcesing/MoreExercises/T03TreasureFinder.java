package M02_ProgrammingFundamentals.L08_TextProcesing.MoreExercises;

import java.util.*;

public class T03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("find")) {
            StringBuilder encrypted = new StringBuilder(input);
            StringBuilder decrypted = new StringBuilder();

            while (encrypted.length() > 0) {
                for (int i = 0; i < keys.length; i++) {
                    if (encrypted.length() == i) {
                        break;
                    }
                    char current = (char) (encrypted.charAt(i) - keys[i]);
                    decrypted.append(current);
                }
                encrypted.delete(0, keys.length);
            }
            findTypeAndCoordinates(decrypted);
            input = scanner.nextLine();
        }
    }

    private static void findTypeAndCoordinates(StringBuilder decrypted) {
        int typeFirstIndex = decrypted.indexOf("&");
        int typeSecondIndex = decrypted.lastIndexOf("&");
        String type = decrypted.substring(typeFirstIndex + 1, typeSecondIndex);

        int coordinatesA = decrypted.indexOf("<");
        int coordinatesB = decrypted.lastIndexOf(">");
        String coordinates = decrypted.substring(coordinatesA + 1, coordinatesB);

        printResult(type, coordinates);
    }

    private static void printResult(String type, String coordinates) {
        System.out.printf("Found %s at %s%n", type, coordinates);
    }
}
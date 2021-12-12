package M02_ProgrammingFundamentals.L08_TextProcesing.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> morseCode = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (String currentLetter : morseCode) {
            switch (currentLetter) {
                case ".-":
                    sb.append("A");
                    break;
                case "-...":
                    sb.append("B");
                    break;
                case "-.-.":
                    sb.append("C");
                    break;
                case "-..":
                    sb.append("D");
                    break;
                case ".":
                    sb.append("E");
                    break;
                case "..-.":
                    sb.append("F");
                    break;
                case "--.":
                    sb.append("G");
                    break;
                case "....":
                    sb.append("H");
                    break;
                case "..":
                    sb.append("I");
                    break;
                case ".---":
                    sb.append("J");
                    break;
                case "-.-":
                    sb.append("K");
                    break;
                case ".-..":
                    sb.append("L");
                    break;
                case "--":
                    sb.append("M");
                    break;
                case "-.":
                    sb.append("N");
                    break;
                case "---":
                    sb.append("O");
                    break;
                case ".--.":
                    sb.append("P");
                    break;
                case "--.-":
                    sb.append("Q");
                    break;
                case ".-.":
                    sb.append("R");
                    break;
                case "...":
                    sb.append("S");
                    break;
                case "-":
                    sb.append("T");
                    break;
                case "..-":
                    sb.append("U");
                    break;
                case "...-":
                    sb.append("V");
                    break;
                case ".--":
                    sb.append("W");
                    break;
                case "-..-":
                    sb.append("X");
                    break;
                case "-.--":
                    sb.append("Y");
                    break;
                case "--..":
                    sb.append("Z");
                    break;
                case "|":
                    sb.append(" ");
                    break;
            }
        }
        System.out.println(sb);
    }
}
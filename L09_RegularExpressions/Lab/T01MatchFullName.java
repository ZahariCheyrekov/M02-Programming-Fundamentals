package M02_ProgrammingFundamentals.L09_RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<name>(?<firstName>[A-Z][a-z]+) (?<secondName>[A-Z][a-z]+))\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> names = new ArrayList<>();
        while (matcher.find()) {
            String name = matcher.group("name");
            names.add(name);
        }
        System.out.println(String.join(" ", names));
    }
}
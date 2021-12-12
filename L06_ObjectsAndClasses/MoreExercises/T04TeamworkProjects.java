package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.MoreExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class T04TeamworkProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTeams = Integer.parseInt(scanner.nextLine());

        List<Team> teamsList = new ArrayList<>();
        while (countOfTeams-- > 0) {
            String[] input = scanner.nextLine().split("-".trim());
            String creator = input[0].trim();
            String teamName = input[1].trim();
            if (teamsList.stream().anyMatch(e -> e.getName().equals(teamName))) {
                System.out.printf("Team %s was already created!%n", teamName);
            } else if (teamsList.stream().anyMatch(e -> e.getCreator().equals(creator))) {
                System.out.printf("%s cannot create another team!%n", creator);
            } else {
                Team newData = new Team();
                newData.setCreator(input[0]);
                newData.setName(input[1]);
                teamsList.add(newData);
                System.out.printf("Team %s has been created by %s!%n", teamName, creator);
            }
        }

        String input;
        while (!"end of assignment".equals(input = scanner.nextLine())) {
            String[] command = input.split("->".trim());
            String user = command[0].trim();
            String teamName = command[1].trim();
            if (teamsList.stream().noneMatch((e -> e.getName().equals(teamName)))) {
                System.out.printf("Team %s does not exist!%n", teamName);
            } else if ((teamsList.stream().anyMatch(e -> e.getCreator().equals(user)))
                    || (teamsList.stream().flatMap(team -> team.getMembers().stream()).
                    anyMatch(member -> member.equals(user)))) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else {
                IntStream.range(0, teamsList.size()).filter(i -> teamsList.get(i).getName().equals(teamName))
                        .forEach(i -> teamsList.get(i).getMembers().add(user));
            }
        }

        teamsList.sort(Comparator.comparing(Team::getName));
        teamsList.sort(Comparator.comparing(Team::numberOfMembers).reversed());
        IntStream.range(0, teamsList.size()).filter(i -> !teamsList.get(i).getMembers().isEmpty()).forEach(i -> {
            System.out.printf("%s%n", teamsList.get(i).getName());
            System.out.printf("- %s%n", teamsList.get(i).getCreator());
            teamsList.forEach(member -> member.getMembers().sort(String::compareTo));
            teamsList.get(i).getMembers().forEach(current -> System.out.printf("-- %s%n", current));
        });
        System.out.println("Teams to disband:");
        teamsList.stream().filter(current -> current.getMembers().isEmpty())
                .forEach(currentTeam -> System.out.printf("%s%n", currentTeam.getName()));
    }

    static class Team {
        String name;
        String creator;
        List<String> members;

        public Team() {
            setMembers(new ArrayList<>());
        }

        public List<String> getMembers() {
            return members;
        }

        public String getName() {
            return name;
        }

        public String getCreator() {
            return creator;
        }

        public void setName(String value) {
            name = value;
        }

        public void setCreator(String value) {
            creator = value;
        }

        public void setMembers(List<String> value) {
            members = value;
        }

        public int numberOfMembers() {
            return members.size();
        }
    }
}
package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T04Songs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song(typeList, name, time);
            songs.add(song);
        }
        String input = scanner.nextLine();
        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }

    }

    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }
    }
}
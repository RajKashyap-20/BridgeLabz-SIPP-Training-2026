package OOPS.Collection.MusicPlayList;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        // Add 10 songs
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Song " + i + ": ");
            String song = sc.nextLine();
            playlist.addFirst(song);
        }
        
        System.out.print("Enter another song: ");
        String newSong = sc.nextLine();
        playlist.addFirst(newSong);


        if (playlist.size() > 10) {
            playlist.removeLast();
        }

        System.out.print("Enter song to search: ");
        String searchSong = sc.nextLine();

        if (playlist.contains(searchSong)) {
            System.out.println("Song Found.");
        } else {
            System.out.println("Song Not Found.");
        }
        System.out.println("\nRecently Played Songs:");
        for (String song : playlist) {
            System.out.println(song);
        }

        sc.close();
    }
}
package Proxy_dp;

import java.util.ArrayList;
import java.util.List;

public class Song implements Searchable {
    private Integer songId;
    private String title;
    private String album;
    private static List<Song> songLibrary = createLibrarySongs();

    public Song() {}

    private Song(Integer songId, String title, String album) {
        this.songId = songId;
        this.title = title;
        this.album = album;
    }

    public void showSongLibrary(){
        for (Song song : songLibrary) {
            System.out.println(song.toString());
        }
        System.out.println("Total songs: " + songLibrary.size());
    }


    @Override
    public void searchById(Integer songId) {
        delay(1000);
        for (Song song : songLibrary) {
            if (song.songId.equals(songId)) {
                System.out.print("Found ");
                System.out.println(song);
                return;
            }
        }
        System.out.printf("Song ID %d not found.%n", songId);
    }

    @Override
    public void searchByTitle(String title) {
        delay(1000);
        boolean hasFound = false;
        for (Song song : songLibrary) {
            if (song.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + song);
                if (!hasFound) {
                    hasFound = true;
                }
            }
        }

        if (!hasFound) {
            System.out.printf("Song title '%s' not found.%n", title);
        }
    }

    @Override
    public void searchByAlbum(String album) {
        delay(1000);
        boolean hasFound = false;
        for (Song song : songLibrary) {
            if (song.album.equalsIgnoreCase(album)) {
                System.out.println("Found: " + song);
                if (!hasFound) {
                    hasFound = true;
                }
            }
        }
        if (!hasFound) {
            System.out.printf("Song album '%s' not found.%n", album);
        }
    }

    public String toString() {
        return "Song ID: " + songId + ", Title: " + title + ", Album: " + album;
    }

    private void delay(int timeDelay){
        // this function is used to mimic the time delay when fetching data from sever
        try{
            Thread.sleep(timeDelay);
        } catch (Exception e)  {}
    }

    private static List<Song> createLibrarySongs(){
        List<Song> songLibrary = new ArrayList<>();
        songLibrary.add(new Song(1, "Human Nature", "Thriller by Michael Jackson"));
        songLibrary.add(new Song(2, "If You Believe", "Rainbow by Kacey Musgraves"));
        songLibrary.add(new Song(3, "Levitating", "Future Nostalgia by Dua Lipa"));
        songLibrary.add(new Song(4, "Imagine", "Imagine by John Lennon"));
        songLibrary.add(new Song(5, "Billie Jean", "Thriller by Michael Jackson"));
        songLibrary.add(new Song(6, "Beat It", "Thriller by Michael Jackson"));
        songLibrary.add(new Song(7, "Something", "Abbey Road by The Beatles"));
        songLibrary.add(new Song(8, "Something", "Living in the Material World by George Harrison"));
        songLibrary.add(new Song(9, "Christmas in Hollis", "Raising Hell by Run-DMC"));
        songLibrary.add(new Song(10, "All I Want for Christmas Is You", "Christmas " +
                "with Mariah Carey by Mariah Carey"));
        return songLibrary;
    }
}

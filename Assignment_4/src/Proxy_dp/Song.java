package Proxy_dp;

import java.util.ArrayList;
import java.util.List;

public class Song implements SongService{
    private Integer songId;
    private String title;
    private String album;
    private static List<Song> songLibrary = new ArrayList<Song>();

    public Song() {
    }

    public Song(Integer songId, String title, String album) {
        this.songId = songId;
        this.title = title;
        this.album = album;
        songLibrary.add(this);
    }

    public String toString() {
        return "Song ID: " + songId + ", Title: " + title + ", Album: " + album;
    }

    @Override
    public Song searchById(Integer songId) {
        for (Song song : songLibrary) {
            if (song.songId.equals(songId)) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> tempLibrary = new ArrayList<Song>();
        for (Song song : songLibrary) {
            if (song.title.equalsIgnoreCase(title)) {
                tempLibrary.add(song);
            }
        }
        return tempLibrary;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> tempLibrary = new ArrayList<Song>();
        for (Song song : songLibrary) {
            if (song.album.equalsIgnoreCase(album)) {
                tempLibrary.add(song);
            }
        }
        return tempLibrary;
    }
}

package Proxy_dp;

import java.util.ArrayList;
import java.util.List;

public class SongProxy implements SongService {
    private SongService songService;

    public Song searchById(Integer songId) {
        if (songService == null) {
            songService = new Song();
        }
        return songService.searchById(songId);
    }

    public List<Song> searchByTitle(String title) {
        if (songService == null) {
            songService = new Song();
        }
        return songService.searchByTitle(title);
    }

    public List<Song> searchByAlbum(String album) {
        if (songService == null) {
            songService = new Song();
        }
        return songService.searchByAlbum(album);
    }
}

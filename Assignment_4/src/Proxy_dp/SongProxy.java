package Proxy_dp;

public class SongProxy implements Searchable {
    private Searchable searchable;

    public void searchById(Integer songId) {
        if (searchable == null) {
            searchable = new Song();
        }
        searchable.searchById(songId);
    }

    public void searchByTitle(String title) {
        if (searchable == null) {
            searchable = new Song();
        }
        searchable.searchByTitle(title);
    }

    public void searchByAlbum(String album) {
        if (searchable == null) {
            searchable = new Song();
        }
        searchable.searchByAlbum(album);
    }
}

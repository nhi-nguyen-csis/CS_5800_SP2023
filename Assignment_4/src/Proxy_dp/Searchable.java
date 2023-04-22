package Proxy_dp;

import java.util.List;

public interface Searchable {
    void searchById(Integer songId);
    void searchByTitle(String title);
    void searchByAlbum(String album);
}

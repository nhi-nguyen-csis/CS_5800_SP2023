package Proxy_dp;

public class Driver {
    public static void main(String[] args) {
        Searchable searchable = new SongProxy();
        System.out.println("---------------Search by ID---------------");
        searchable.searchById(2);
        searchable.searchById(10);
        searchable.searchById(101);
        System.out.println("\n---------------Search by Title---------------");
        searchable.searchByTitle("Something");
        searchable.searchByTitle("We Are The World");
        System.out.println("\n---------------Search by Album---------------");
        searchable.searchByAlbum("Thriller by Michael Jackson");
        searchable.searchByAlbum("Dangerous by Michael Jackson");
    }
}

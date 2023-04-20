package Proxy_dp;

public class SongDriver {
    public static void main(String[] args) {
        // create 10 songs
        createSongs();

        SongService songService = new SongProxy();
        System.out.println(songService.searchById(10));

        try{
            Thread.sleep(1000);
        } catch (Exception e)  {}

        System.out.println(songService.searchByTitle("Something").toString());

        try{
            Thread.sleep(1000);
        } catch (Exception e)  {}

        System.out.println(songService.searchByAlbum("Thriller by Michael Jackson").toString());
    }

    public static void createSongs(){
        Song song = new Song(1, "Human Nature", "Thriller by Michael Jackson");
        song = new Song(2, "If You Believe", "Rainbow by Kacey Musgraves");
        song = new Song(3, "Levitating", "Future Nostalgia by Dua Lipa");
        song = new Song(4, "Imagine", "Imagine by John Lennon");
        song = new Song(5, "Billie Jean", "Thriller by Michael Jackson");
        song = new Song(6, "Beat It", "Thriller by Michael Jackson");
        song = new Song(7, "Something", "Abbey Road by The Beatles");
        song = new Song(8, "Something", "Living in the Material World by George Harrison");
        song = new Song(9, "Christmas in Hollis", "Raising Hell by Run-DMC");
        song = new Song(10, "All I Want for Christmas Is You", "Christmas " +
                "with Mariah Carey by Mariah Carey");
    }

}

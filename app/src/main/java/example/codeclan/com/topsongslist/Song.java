package example.codeclan.com.topsongslist;

/**
 * Created by user on 19/04/2017.
 */

public class Song {
    private int ranking;
    private String title;
    private String artist;

    public Song(Integer ranking, String title, String artist) {
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

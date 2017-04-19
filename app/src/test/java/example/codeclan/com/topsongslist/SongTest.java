package example.codeclan.com.topsongslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class SongTest {

        Song song;

        @Before
        public void before() {
            song = new Song(1, "Sign of the Times", "Harry Styles");
        }

        @Test
        public void getRankingTest() {
            assertEquals((Integer)1, song.getRanking());

        }

        @Test
        public void getTitleTest() {
            assertEquals("Sign of the Times", song.getTitle());

        }

        @Test
        public void getYearTest() {
            assertEquals("Harry Styles", song.getArtist());

        }
}

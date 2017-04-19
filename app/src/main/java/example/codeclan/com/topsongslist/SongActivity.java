package example.codeclan.com.topsongslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    private TextView showTitle;
    private TextView showArtist;
    private TextView showRanking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        showTitle = (TextView) findViewById(R.id.showTitle);
        showArtist = (TextView) findViewById(R.id.showArtist);
        showRanking = (TextView) findViewById(R.id.showRanking);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String title = extras.getString("title");
        String artist = extras.getString("artist");
        String ranking = extras.getString("ranking");

        String showTitleString = "Title: " + title;
        String showArtistString = "Artist: " + artist;
        String showRankingString = "Current Chart Position: " + ranking;

        showTitle.setText(showTitleString);
        showArtist.setText(showArtistString);
        showRanking.setText(showRankingString);


    }
}

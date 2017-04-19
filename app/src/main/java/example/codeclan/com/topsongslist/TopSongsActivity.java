package example.codeclan.com.topsongslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdapter songsAdapter = new TopSongsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songsAdapter);
    }

    public void getSong(View listItem){
        Song song = (Song) listItem.getTag();
        Log.d("Song title: ", song.getTitle());
        String title = song.getTitle();
        String artist = song.getArtist();
        String ranking = song.getRanking().toString();
        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("artist", artist);
        intent.putExtra("ranking", ranking);
        startActivity(intent);
    }
}

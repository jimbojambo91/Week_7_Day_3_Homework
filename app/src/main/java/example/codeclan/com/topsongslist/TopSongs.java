package example.codeclan.com.topsongslist;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "Sign of the Times", "Harry Styles"));
        list.add(new Song(2, "Shape of You", "Ed Sheeran"));
        list.add(new Song(3, "Galway Girl", "Ed Sheeran"));
        list.add(new Song(4, "Symphony (feat. Zara Larsson)", "Clean Bandit"));
        list.add(new Song(5, "Passionfruit", "Drake"));
        list.add(new Song(6, "Something Just Like This", "The Chainsmokers & Coldplay"));
        list.add(new Song(7, "Solo Dance", "Martin Jensen"));
        list.add(new Song(8, "Stay (feat. Alessia Cara)", "Zedd"));
        list.add(new Song(9, "It Ain't Me", "Kygo & Selena Gomez"));
        list.add(new Song(10, "Castle on the Hill", "Ed Sheeran"));
        list.add(new Song(11, "Issues", "Julia Michaels"));
        list.add(new Song(12, "Ciao Adios", "Anne-Marie"));
        list.add(new Song(13, "That's What I Like", "Bruno Mars"));
        list.add(new Song(14, "You Don't Know Me", "Jax Jones"));
        list.add(new Song(15, "Slide (feat Frank Ocean)", "Calvin Harris"));
        list.add(new Song(16, "No More Sad Songs", "Little Mix"));
        list.add(new Song(17, "Chained To The Rhythm", "Katy Perry"));
        list.add(new Song(18, "Skin", "Rag'n'Bone Man"));
        list.add(new Song(19, "Green Light", "Lorde"));
        list.add(new Song(20, "Scared to Be Lonely", "Martin Garrix & Dua Lipa"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}

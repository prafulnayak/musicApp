package org.sairaa.musicapp;

import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class ArtistDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_details);
        String artist = getIntent().getStringExtra(getString(R.string.artist));
        //Array list to all music
        final ArrayList<Music> songsToDisplay = new ArrayList<Music>();

        songsToDisplay.add(new Music(getString(R.string.soorma),getString(R.string.soorma_song1),getString(R.string.sukhwinder),R.drawable.play_circle,R.drawable.soorma));
        songsToDisplay.add(new Music(getString(R.string.soorma),getString(R.string.soorma_song2),getString(R.string.shankarMahadevan),R.drawable.play_circle,R.drawable.soorma));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song1),getString(R.string.meet_bros),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song2),getString(R.string.mika),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song3),getString(R.string.atif_aslam),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.baaghi2),getString(R.string.baaghi2_song1),getString(R.string.atif_aslam),R.drawable.play_circle,R.drawable.baaghi));
        songsToDisplay.add(new Music(getString(R.string.rustom),getString(R.string.rustom_song1),getString(R.string.atif_aslam),R.drawable.play_circle,R.drawable.rustom));
        songsToDisplay.add(new Music(getString(R.string.sonu_ke),getString(R.string.sonu_ke_song1),getString(R.string.yoyo),R.drawable.play_circle,R.drawable.sonuk));
        songsToDisplay.add(new Music(getString(R.string.sonu_ke),getString(R.string.sonu_ke_song2),getString(R.string.arjit),R.drawable.play_circle,R.drawable.sonuk));
        songsToDisplay.add(new Music(getString(R.string.padman),getString(R.string.padman_song1),getString(R.string.arjit),R.drawable.play_circle,R.drawable.padman));
        songsToDisplay.add(new Music(getString(R.string.razzi),getString(R.string.razzi_song1),getString(R.string.arjit),R.drawable.play_circle,R.drawable.raazi));
        //ArrayList to only having same name as the artist
        final ArrayList<Music> songsToPush = new ArrayList<Music>();

        for(int i =0; i<songsToDisplay.size();i++){
            if(artist.equals(songsToDisplay.get(i).getArtist())){
                songsToPush.add(songsToDisplay.get(i));
            }
        }
        //musicDetailsAdapter for a listview containing single artist or album
        musicDetailsAdapter mAdapter = new musicDetailsAdapter(ArtistDetails.this,songsToPush);
        ListView listView = findViewById(R.id.list_item_songs);
        listView.setAdapter(mAdapter);


    }
}

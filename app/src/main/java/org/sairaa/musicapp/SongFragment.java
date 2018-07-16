package org.sairaa.musicapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class SongFragment extends Fragment {

    public SongFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_activity, container, false);
        final ArrayList<Music> songsToDisplay = new ArrayList<Music>();

        songsToDisplay.add(new Music(getString(R.string.soorma),getString(R.string.soorma_song1),getString(R.string.soorma_song1_artist),R.drawable.play_circle,R.drawable.soorma));
        songsToDisplay.add(new Music(getString(R.string.soorma),getString(R.string.soorma_song2),getString(R.string.soorma_song2_artist),R.drawable.play_circle,R.drawable.soorma));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song1),getString(R.string.race3_song1_artist),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song2),getString(R.string.race3_song2_artist),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.race3),getString(R.string.race3_song3),getString(R.string.race3_song3_artist),R.drawable.play_circle,R.drawable.race3));
        songsToDisplay.add(new Music(getString(R.string.baaghi2),getString(R.string.baaghi2_song1),getString(R.string.baaghi2_song1_artist),R.drawable.play_circle,R.drawable.baaghi));
        songsToDisplay.add(new Music(getString(R.string.rustom),getString(R.string.rustom_song1),getString(R.string.rustom_song1_artist),R.drawable.play_circle,R.drawable.rustom));
        songsToDisplay.add(new Music(getString(R.string.sonu_ke),getString(R.string.sonu_ke_song1),getString(R.string.sonu_ke_song1_artist),R.drawable.play_circle,R.drawable.sonuk));
        songsToDisplay.add(new Music(getString(R.string.sonu_ke),getString(R.string.sonu_ke_song2),getString(R.string.sonu_ke_song2_artist),R.drawable.play_circle,R.drawable.sonuk));
        songsToDisplay.add(new Music(getString(R.string.padman),getString(R.string.padman_song1),getString(R.string.padman_song1_artist),R.drawable.play_circle,R.drawable.padman));
        songsToDisplay.add(new Music(getString(R.string.razzi),getString(R.string.razzi_song1),getString(R.string.razzi_song1_artist),R.drawable.play_circle,R.drawable.raazi));

//        songsToDisplay.add(new Music("Sairat","hello hi45","Ena"));
//        songsToDisplay.add(new Music("Sairat","hello h457i","Ena"));
//        songsToDisplay.add(new Music("Sairat","hello h14i","Ena"));
//        songsToDisplay.add(new Music("Sairat","hello hi4","Ena"));
//        songsToDisplay.add(new Music("Sairat","hello hi","Ena"));

        musicAdapter mAdapter = new musicAdapter(getActivity(),songsToDisplay);
        GridView gridView = rootView.findViewById(R.id.gridview_song);
        gridView.setAdapter(mAdapter);

        return rootView;
    }
}

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

public class ArtistFragment extends Fragment {

    public ArtistFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_activity, container, false);
        final ArrayList<Music> songsToDisplay = new ArrayList<Music>();

        songsToDisplay.add(new Music(getString(R.string.sukhwinder),R.drawable.sukhwinder));
        songsToDisplay.add(new Music(getString(R.string.shankarMahadevan),R.drawable.shankar));
        songsToDisplay.add(new Music(getString(R.string.meet_bros),R.drawable.meet));
        songsToDisplay.add(new Music(getString(R.string.mika),R.drawable.mika));
        songsToDisplay.add(new Music(getString(R.string.atif_aslam),R.drawable.atif));
        songsToDisplay.add(new Music(getString(R.string.yoyo),R.drawable.yoyo));
        songsToDisplay.add(new Music(getString(R.string.arjit),R.drawable.arjit));


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


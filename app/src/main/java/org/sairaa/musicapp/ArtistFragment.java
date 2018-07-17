package org.sairaa.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.gson.Gson;

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

        musicAdapter mAdapter = new musicAdapter(getActivity(),songsToDisplay);
        GridView gridView = rootView.findViewById(R.id.gridview_song);
        gridView.setAdapter(mAdapter);
        // On Artist fragment the artist name is passed to new Activity "ArtistDetails" on item click
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Music sMusic = songsToDisplay.get(position);
                Intent intent = new Intent(getActivity(),ArtistDetails.class);
                intent.putExtra(getString(R.string.artist),sMusic.getArtist());
                getActivity().startActivity(intent);
            }
        });

        return rootView;


    }
}


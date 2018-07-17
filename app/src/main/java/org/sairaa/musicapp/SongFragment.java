package org.sairaa.musicapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.util.ArrayList;

public class SongFragment extends Fragment {

    private TextView textSlide;
    private ImageView imageSlide, playImage, pauseImage;
    SlidingUpPanelLayout slidingPanel;

    public SongFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_activity, container, false);
        final ArrayList<Music> songsToDisplay = new ArrayList<Music>();
        textSlide = getActivity().findViewById(R.id.text_slide);
        imageSlide = getActivity().findViewById(R.id.image_slide);
        playImage = getActivity().findViewById(R.id.play_image);
        pauseImage = getActivity().findViewById(R.id.pause_image);
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

        musicAdapter mAdapter = new musicAdapter(getActivity(),songsToDisplay);
        GridView gridView = rootView.findViewById(R.id.gridview_song);
        gridView.setAdapter(mAdapter);
        //sliding panel
        slidingPanel = getActivity().findViewById(R.id.sliding_layout);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Music sMusic = songsToDisplay.get(position);
                imageSlide.setBackgroundResource(sMusic.getMusicResource());
                textSlide.setText(sMusic.getSongName());
                playImage.setVisibility(View.INVISIBLE);
                pauseImage.setVisibility(View.VISIBLE);
                //On touch to any songs anchor the sliding panel
//                slidingPanel.setPanelState(SlidingUpPanelLayout.PanelState.ANCHORED);
                slidingPanel.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
            }
        });

        return rootView;
    }
}

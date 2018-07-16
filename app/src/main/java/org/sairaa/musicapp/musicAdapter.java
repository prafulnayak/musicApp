package org.sairaa.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class musicAdapter extends ArrayAdapter<Music>{
    public musicAdapter(Activity context, ArrayList<Music> songsList) {
        super(context,0,songsList);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_view, parent, false);
        }

        Music currentSong = getItem(position);
        if(currentSong.hasArtistFragment()){
            ImageView songImage = listItemView.findViewById(R.id.pic);
            songImage.setBackgroundResource(currentSong.getMusicResource());
            ImageView playIcon =  listItemView.findViewById(R.id.play_icon);
            playIcon.setBackgroundResource(currentSong.getPlayImageResourceId());
            TextView titleView = listItemView.findViewById(R.id.title_song);
            titleView.setText(currentSong.getSongName());
            TextView artistNmae = listItemView.findViewById(R.id.artist);
            artistNmae.setText(currentSong.getArtist());
        }else{
            ImageView songImage = listItemView.findViewById(R.id.pic);
            songImage.setBackgroundResource(currentSong.getMusicResource());
            TextView titleView = listItemView.findViewById(R.id.title_song);
            titleView.setVisibility(View.INVISIBLE);
            TextView artistNmae = listItemView.findViewById(R.id.artist);
            artistNmae.setText(currentSong.getArtist());
        }

        return listItemView;
    }
}

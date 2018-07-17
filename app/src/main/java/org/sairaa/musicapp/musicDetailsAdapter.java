package org.sairaa.musicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class musicDetailsAdapter extends ArrayAdapter<Music> {

    public musicDetailsAdapter(Activity context, ArrayList<Music> songsList) {
        super(context,0,songsList);

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_view_details, parent, false);
        }

        Music currentSong = getItem(position);


            ImageView songImage = listItemView.findViewById(R.id.detail_image);
            songImage.setBackgroundResource(currentSong.getMusicResource());
            ImageView playIcon =  listItemView.findViewById(R.id.detail_play_image);
            playIcon.setBackgroundResource(currentSong.getPlayImageResourceId());
            TextView titleView = listItemView.findViewById(R.id.detail_song);
            titleView.setText(currentSong.getSongName());
            TextView artistNmae = listItemView.findViewById(R.id.detail_artist);
            artistNmae.setText(currentSong.getArtist());
            TextView album = listItemView.findViewById(R.id.detail_album);
            album.setText(currentSong.getAlbum());


        return listItemView;
    }
}

package org.sairaa.musicapp;

public class Music {

    private String album;
    private String songName;
    private String artist;
    private int playImageId;
    private  int playSongImageId;
    // a CONSTANT to check image id is passed or not
    private static final int NOIMAGEID = -1;

    //Image Id
    private int imageId = NOIMAGEID;

    public Music(String mAlbum, String mSongName, String mArtist){
        album = mAlbum;
        songName = mSongName;
        artist = mArtist;
    }

    public Music(String mAlbum, String mSongName, String mArtist, int mPlayImageId, int mPlaySongId){
        album = mAlbum;
        songName = mSongName;
        artist = mArtist;
        playImageId = mPlayImageId;
        playSongImageId = mPlaySongId;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageIdResourceId() {
        return imageId;
    }
    public int getPlayImageResourceId(){
        return playImageId;
    }
    public boolean hasImageResource(){

        // It Returns 'TRUE' if image is passed to the constructor or else returns 'FALSE'
        return (imageId != NOIMAGEID);
    }
    /*
     * This method returns image Resource ID of the Audio File/Sound
     */
    public int getMusicResource(){
        return playSongImageId;
    }

}

package org.sairaa.musicapp;

public class Music {

    private String album;
    private String songName;
    private String artist;
    private int playImageId;
    private  int playSongImageId;
    // a CONSTANT to check play image id is passed or not
    private static final int NOIMAGEID = -1;

    //Image Id
    private int artistFragment = NOIMAGEID;

    public Music(String mArtist,int mPlaySongId){
        artist = mArtist;
        playSongImageId = mPlaySongId;
    }

    public Music(String mAlbum, String mSongName, String mArtist, int mPlayImageId, int mPlaySongId){
        album = mAlbum;
        songName = mSongName;
        artist = mArtist;
        playImageId = mPlayImageId;
        playSongImageId = mPlaySongId;
        artistFragment = mPlayImageId;
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

    public int getArtistFragment() {
        return artistFragment;
    }
    public int getPlayImageResourceId(){
        return playImageId;
    }
    public boolean hasArtistFragment(){

        // It Returns 'TRUE' if artist fragment clicked  to the constructor or else returns 'FALSE'
        return (artistFragment != NOIMAGEID);
    }
    /*
     * This method returns image Resource ID
     */
    public int getMusicResource(){
        return playSongImageId;
    }

}

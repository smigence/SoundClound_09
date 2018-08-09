package com.example.hoang.soundclound_09.data;

/**
 * Created by AM on 8/1/2018.
 */

public class Track {

    private String mTitle;
    private String mStreamUrl;
    private String mArtWorkUrl;
    private String mGenre;
    private String mDownloadUrl;
    private int mId;

    public Track(int id, String title, String genre, String streamUrl,
                 String artworkUrl, String downloadUrl) {

        this.mTitle = title;
        this.mStreamUrl = streamUrl;
        this.mArtWorkUrl = artworkUrl;
        this.mGenre = genre;
        this.mDownloadUrl = downloadUrl;
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public String getArtWorkUrl() {
        return mArtWorkUrl;
    }

    public String getGenre() {
        return mGenre;
    }

    public String getDownloadUrl() {
        return mDownloadUrl;
    }

    public int getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setStreamUrl(String streamUrl) {
        mStreamUrl = streamUrl;
    }

    public void setArtWorkUrl(String artWorkUrl) {
        mArtWorkUrl = artWorkUrl;
    }

    public void setGenre(String genre) {
        mGenre = genre;
    }

    public void setDownloadUrl(String downloadUrl) {
        mDownloadUrl = downloadUrl;
    }

    public void setId(int id) {
        mId = id;
    }

    public class JsonKey {
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String GENRE = "genre";
        public static final String STREAM_URL = "stream_url";
        public static final String ARTWORK_URL = "artwork_url";
        public static final String DOWNLOAD_URL = "download_url";
    }
}

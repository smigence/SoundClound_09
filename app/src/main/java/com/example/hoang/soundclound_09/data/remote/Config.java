package com.example.hoang.soundclound_09.data.remote;

import com.example.hoang.soundclound_09.BuildConfig;

/**
 * Created by AM on 8/1/2018.
 */

public class Config {

    public static final String TRACK_LIMIT = "&limit=4";
    public static final String API_URL = "https://api.soundcloud.com";
    public static final String TRACK_URL = API_URL + "/tracks?client_id=";
    public static final String TRACK_URL_GENRE = TRACK_URL + BuildConfig.API_KEY + TRACK_LIMIT + "&genres=";
    public static final String GENRE_CLASSICAL = "Classical";
    public static final String GENRE_COUNTRY = "Country";
    public static final String GENRE_AMBIENT = "Ambient";

    public static final String GET_METHOD = "GET";
    public static final String BREAK_LINE = "\n";
}

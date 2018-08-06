package com.example.hoang.soundclound_09.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by AM on 8/7/2018.
 */

public class JSONUtils {

    public static ArrayList<Track> parseJsonToTracks(JSONArray jsons) throws JSONException {
        ArrayList<Track> tracks = new ArrayList<>();

        for (int i = 0; i < jsons.length(); i++) {
            JSONObject json = jsons.getJSONObject(i);
            tracks.add(getTrackFromJson(json));
        }
        return tracks;
    }

    public static Track getTrackFromJson(JSONObject json) throws JSONException {
        int id = 0;
        String title = "";
        String genre = "";
        String streamUrl = "";
        String artworkUrl = "";
        String downloadUrl = "";

        id = json.getInt(Track.JsonKey.ID);
        title = json.getString(Track.JsonKey.TITLE);
        genre = json.getString(Track.JsonKey.GENRE);
        streamUrl = json.getString(Track.JsonKey.STREAM_URL);
        artworkUrl = json.getString(Track.JsonKey.ARTWORK_URL);
        downloadUrl = json.getString(Track.JsonKey.DOWNLOAD_URL);
        Track track = new Track(id, title, genre, streamUrl, artworkUrl, downloadUrl);
        return track;
    }
}

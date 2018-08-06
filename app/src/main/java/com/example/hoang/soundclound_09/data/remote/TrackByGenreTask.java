package com.example.hoang.soundclound_09.data.remote;

import android.os.AsyncTask;

import com.example.hoang.soundclound_09.data.JSONUtils;
import com.example.hoang.soundclound_09.data.OnGetDataCompletedListener;
import com.example.hoang.soundclound_09.data.Track;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AM on 8/1/2018.
 */

public class TrackByGenreTask extends AsyncTask<String, Void, ArrayList<Track>> {

    private SoundCloudApiConnection mConnection = null;
    private OnGetDataCompletedListener mDataCompletedListener;

    public TrackByGenreTask(OnGetDataCompletedListener dataCompletedListener) {
        this.mDataCompletedListener = dataCompletedListener;
    }

    @Override
    protected ArrayList<Track> doInBackground(String... strings) {
        ArrayList<Track> tracks = null;
        try {
            mConnection = new SoundCloudApiConnection(Config.TRACK_URL_GENRE +
                    strings[0]);
            mConnection.connect();
            tracks = JSONUtils.parseJsonToTracks
                    (mConnection.getArrayJsonObject());
        } catch (IOException e) {
            return null;
        } catch (JSONException e) {
            return null;
        }
        mConnection.close();
        return tracks;
    }

    @Override
    protected void onPostExecute(ArrayList<Track> tracks) {
        super.onPostExecute(tracks);
        mDataCompletedListener.onGetTracksByGenreCompleted(tracks);
    }
}

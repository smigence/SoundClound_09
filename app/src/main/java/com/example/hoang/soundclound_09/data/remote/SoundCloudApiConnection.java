package com.example.hoang.soundclound_09.data.remote;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by AM on 8/2/2018.
 */

public class SoundCloudApiConnection {

    private HttpURLConnection mConnection;
    private InputStream mInputStream;

    public SoundCloudApiConnection(String link) throws IOException {
        mInputStream = null;
        URL url = new URL(link);
        mConnection = (HttpURLConnection) url.openConnection();
        mConnection.setRequestMethod(Config.GET_METHOD);
    }

    public void connect() throws IOException {
        mConnection.connect();
        mInputStream = mConnection.getInputStream();
    }

    public JSONArray getArrayJsonObject() throws IOException, JSONException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(mInputStream));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        JSONArray jsonObject = null;

        while ((line = reader.readLine()) != null) {
            buffer.append(line + Config.BREAK_LINE);
        }
        jsonObject = new JSONArray(buffer.toString());
        if (reader != null) reader.close();
        return jsonObject;
    }

    public void close() {
        if (mConnection != null) mConnection.disconnect();
    }

}

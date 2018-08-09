package com.example.hoang.soundclound_09.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AM on 8/7/2018.
 */

public interface OnGetDataCompletedListener {
    void onGetTracksByGenreCompleted(ArrayList<Track> tracks);
}

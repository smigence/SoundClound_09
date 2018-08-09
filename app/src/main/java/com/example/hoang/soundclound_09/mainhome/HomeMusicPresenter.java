package com.example.hoang.soundclound_09.mainhome;

import com.example.hoang.soundclound_09.data.Track;
import com.example.hoang.soundclound_09.data.remote.TrackByGenreTask;

import java.util.List;

public class HomeMusicPresenter implements HomeMusicContract.presenter {
    private HomeMusicContract.View mView;

    public HomeMusicPresenter(HomeMusicContract.View view) {
        this.mView = view;
    }
    @Override
    public void loadListGenerMusic(List<Track> tracks) {
        mView.showListGenerMusic(tracks);
    }
    public void loadGenreTracks (String genre) {
        new TrackByGenreTask(this).execute(genre);
    }
}

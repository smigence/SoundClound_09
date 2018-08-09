package com.example.hoang.soundclound_09.mainhome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;
import com.example.hoang.soundclound_09.data.Track;
import com.example.hoang.soundclound_09.data.remote.Config;
import com.example.hoang.soundclound_09.data.remote.TrackByGenreTask;
import com.example.hoang.soundclound_09.personal.LocalMusicContract;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements HomeMusicContract.View, AblumAdapter.ItemHomeMusicClickListener {

    private String[] mGenres = {Config.GENRE_CLASSICAL,Config.GENRE_COUNTRY,Config.GENRE_AMBIENT};
    private HomeMusicPresenter mHomeMusicPresenter;
    private AblumAdapter ablumAdapter;
    private List<List<Track>> mListTracks;

    public HomeFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_,
                container, false);
        mListTracks = new ArrayList<>();
        mHomeMusicPresenter = new HomeMusicPresenter(this);
        for (String genre:mGenres) {
            mHomeMusicPresenter.loadGenreTracks(genre);
        }
        initAllMusic(view);
        return view;
    }

    private void initAllMusic(View view) {
        RecyclerView recyclerViewAllMusic = view.findViewById(R.id.recycer_all_music);
        ablumAdapter = new AblumAdapter(getActivity(), this, mGenres,mListTracks);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        recyclerViewAllMusic.setLayoutManager(layoutManager);
        recyclerViewAllMusic.setAdapter(ablumAdapter);
    }

    @Override
    public void onItemHomeMusicClick(int postition) {
    }

    @Override
    public void onItemGenerMusicClick(int postition) {
    }

    @Override
    public void showListGenerMusic(List<Track> tracks) {
        mListTracks.add(tracks);
        ablumAdapter.notifyDataSetChanged();
    }
}

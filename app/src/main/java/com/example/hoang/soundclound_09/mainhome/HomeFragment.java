package com.example.hoang.soundclound_09.mainhome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class HomeFragment extends Fragment {
    public HomeFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAllMusic(view);
    }

    private void initAllMusic(View view) {
        RecyclerView recyclerViewAllMusic = view.findViewById(R.id.recycer_all_music);
        AblumAdapter ablumAdapter = new AblumAdapter(getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        recyclerViewAllMusic.setLayoutManager(layoutManager);
        recyclerViewAllMusic.setAdapter(ablumAdapter);
    }
}

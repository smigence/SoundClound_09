package com.example.hoang.soundclound_09.personal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class MyMusicFragment extends Fragment implements LocalMusicContract.View, PersonalAdapter.ItemLocalMusicClickListener {
    public MyMusicFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mymusic, container, false);
        initViewPersonal(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void initViewPersonal(View view) {
        RecyclerView recyclerViewPersonl = view.findViewById(R.id.recycer_person);
        PersonalAdapter personalAdapter = new PersonalAdapter(getContext(), this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext()
                , LinearLayoutManager.VERTICAL, false);
        recyclerViewPersonl.setLayoutManager(layoutManager);
        recyclerViewPersonl.setAdapter(personalAdapter);
    }

    @Override
    public void showLocalMusic() {
    }

    @Override
    public void onItemLocalMusicClick(int postition) {
    }
}

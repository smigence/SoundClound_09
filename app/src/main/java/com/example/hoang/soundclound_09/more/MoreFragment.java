package com.example.hoang.soundclound_09.more;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class MoreFragment extends Fragment {
    public MoreFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_more_, container, false);
    }
}

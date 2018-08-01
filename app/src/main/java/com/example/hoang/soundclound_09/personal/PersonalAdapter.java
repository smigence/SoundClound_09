package com.example.hoang.soundclound_09.personal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class PersonalAdapter extends RecyclerView.Adapter<PersonalAdapter.PersonalHolder> {
    private ItemLocalMusicClickListener mLocalMusicClickListener;
    private Context mContext;

    public PersonalAdapter(Context context, ItemLocalMusicClickListener localMusicOnClick) {
        this.mContext = context;
        this.mLocalMusicClickListener = localMusicOnClick;
    }

    @NonNull
    @Override
    public PersonalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_mymusic, viewGroup, false);
        return new PersonalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalHolder personalHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PersonalHolder extends RecyclerView.ViewHolder {
        public PersonalHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public interface ItemLocalMusicClickListener {
        void onItemLocalMusicClick(int postition);
    }
}

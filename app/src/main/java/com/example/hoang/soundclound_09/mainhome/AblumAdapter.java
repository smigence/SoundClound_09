package com.example.hoang.soundclound_09.mainhome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hoang.soundclound_09.R;
import com.example.hoang.soundclound_09.data.Track;

import java.util.ArrayList;
import java.util.List;

public class AblumAdapter extends RecyclerView.Adapter<AblumAdapter.AblumAdapterHolder> {
    private String[] genres;
    private Context mContext;
    private ItemHomeMusicClickListener mItemHomeMusicClickListener;
    private List<List<Track>> mTrackList;

    public AblumAdapter(Context Context, ItemHomeMusicClickListener iteamHomeMusicClick,String[] genres,
                        List<List<Track>> listTracks) {
        this.mContext = Context;
        this.mItemHomeMusicClickListener = iteamHomeMusicClick;
        this.genres = genres;
        mTrackList = listTracks;
    }

    public void addTracks (List<Track> tracks) {
        mTrackList.add(tracks);
    }

    @NonNull
    @Override
    public AblumAdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_genres, viewGroup, false);
        return new AblumAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AblumAdapterHolder ablumAdapterHolder, int i) {
        ablumAdapterHolder.mTextGener.setText(genres[i]);
        ablumAdapterHolder.initDetailGenres(i);
    }

    @Override
    public int getItemCount() {
        return mTrackList.size();
    }

    public class AblumAdapterHolder extends RecyclerView.ViewHolder {
        private TextView mTextGener;
        private RecyclerView mRecyclerGener;

        public AblumAdapterHolder(@NonNull View itemView) {
            super(itemView);
            mTextGener = itemView.findViewById(R.id.text_theloai);
            mRecyclerGener = itemView.findViewById(R.id.recycer_genres);
        }

        private void initDetailGenres(int i) {
            AblumDetailAdapter ablumDetailAdapter = new AblumDetailAdapter(mContext, mTrackList.get(i));
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,
                    LinearLayoutManager.HORIZONTAL, false);
            mRecyclerGener.setLayoutManager(layoutManager);
            mRecyclerGener.setAdapter(ablumDetailAdapter);
        }
    }


    public interface ItemHomeMusicClickListener {
        void onItemHomeMusicClick(int postition);
        void onItemGenerMusicClick(int postition);
    }
}

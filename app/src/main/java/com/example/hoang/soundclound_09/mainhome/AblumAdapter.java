package com.example.hoang.soundclound_09.mainhome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class AblumAdapter extends RecyclerView.Adapter<AblumAdapter.AblumAdapterHolder> {
    private Context mContext;

    public AblumAdapter(Context Context) {
        this.mContext = Context;
    }

    @NonNull
    @Override
    public AblumAdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_genres, viewGroup, false);
        initDetailGenres(view);
        return new AblumAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AblumAdapterHolder ablumAdapterHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AblumAdapterHolder extends RecyclerView.ViewHolder {
        public AblumAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private void initDetailGenres(View view) {
        RecyclerView recyclerViewDetailGenres = view.findViewById(R.id.recycer_genres);
        AblumDetailAdapter ablumDetailAdapter = new AblumDetailAdapter(mContext);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mContext,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerViewDetailGenres.setLayoutManager(layoutManager);
        recyclerViewDetailGenres.setAdapter(ablumDetailAdapter);
    }
}

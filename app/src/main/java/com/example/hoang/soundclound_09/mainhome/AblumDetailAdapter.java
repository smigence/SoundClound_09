package com.example.hoang.soundclound_09.mainhome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoang.soundclound_09.R;

public class AblumDetailAdapter extends RecyclerView.Adapter<AblumDetailAdapter.AblumDetailAdapterHolder> {
    private Context mContext;

    public AblumDetailAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public AblumDetailAdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_music, viewGroup, false);
        return new AblumDetailAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AblumDetailAdapterHolder ablumDetailAdapterHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AblumDetailAdapterHolder extends RecyclerView.ViewHolder {
        public AblumDetailAdapterHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

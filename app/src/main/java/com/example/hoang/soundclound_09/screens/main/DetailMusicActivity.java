package com.example.hoang.soundclound_09.screens.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.hoang.soundclound_09.R;

public class DetailMusicActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageBackDetail;
    private TextView mTextNameSongDetail;
    private TextView mTextNameSingerDetail;
    private ImageView mImageAvataDetail;
    private TextView mTextCurentTime;
    private TextView mTextTotalTime;
    private SeekBar mSeekBarDetail;
    private ImageView mImageLoop;
    private TextView mTextLoop;
    private ImageView mImagePreviou;
    private ImageView mImagePlay;
    private ImageView mImageNext;
    private ImageView mImageMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_music);
        init();

    }

    private void addeventclick() {
        mImageAvataDetail.setOnClickListener(this);
        mImageLoop.setOnClickListener(this);
        mImagePreviou.setOnClickListener(this);
        mImagePlay.setOnClickListener(this);
        mImageNext.setOnClickListener(this);
        mImageMore.setOnClickListener(this);

    }

    private void init() {
        mImageBackDetail = findViewById(R.id.image_detail_back);
        mTextNameSongDetail = findViewById(R.id.text_name_song_detail);
        mTextNameSingerDetail = findViewById(R.id.text_name_singer_detail);
        mImageAvataDetail = findViewById(R.id.image_avata_detail);
        mTextCurentTime = findViewById(R.id.text_time_current);
        mTextTotalTime = findViewById(R.id.text_total_time);
        mSeekBarDetail = findViewById(R.id.seekbar_detail);
        mImageLoop = findViewById(R.id.image_loop);
        mTextLoop = findViewById(R.id.text_loop);
        mImagePreviou = findViewById(R.id.image_previous);
        mImagePlay = findViewById(R.id.image_play);
        mImageNext = findViewById(R.id.image_next);
        mImageMore = findViewById(R.id.image_more_detail);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_detail_back:

                break;
            case R.id.image_loop:

                break;
            case R.id.image_previous:

                break;
            case R.id.image_play:

                break;
            case R.id.image_next:

                break;
            case R.id.image_more_detail:

                break;
            default:

        }
    }
}

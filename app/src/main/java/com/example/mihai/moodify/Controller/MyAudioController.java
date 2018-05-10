package com.example.mihai.moodify.Controller;

import android.util.Log;

import com.spotify.sdk.android.player.AudioController;

public class MyAudioController implements AudioController {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public int onAudioDataDelivered(short[] shorts, int i, int i1, int i2) {
        Log.d("MainActivity", "Sample rate: " + i1);

        return i;
    }

    @Override
    public void onAudioFlush() {

    }

    @Override
    public void onAudioPaused() {

    }

    @Override
    public void onAudioResumed() {

    }
}

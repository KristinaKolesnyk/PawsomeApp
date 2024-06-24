package com.kristina.common;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;

public abstract class StatisticParent extends AppCompatActivity {

    private MaterialTextView stats_LBL_save;

    protected abstract String getData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        findViews();
        updateUI();
    }

    private void updateUI() {
        stats_LBL_save.setText("Petting History:\n\n" + getData());

    }

    private void findViews() {
        stats_LBL_save = findViewById(R.id.stats_LBL_save);
    }
}

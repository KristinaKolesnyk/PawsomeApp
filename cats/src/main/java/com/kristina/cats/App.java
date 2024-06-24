package com.kristina.cats;

import com.kristina.common.AppManager;

public class App extends AppManager {

    @Override
    public void onCreate() {
        super.onCreate();
        statsClass = CatActivity.class;
        initializeStatsClass();
    }

    @Override
    protected void initializeStatsClass() {
        if (statsClass == null) {
            // Default to AppActivity if statsClass is null
            statsClass = CatActivity.class;
        }
    }
}

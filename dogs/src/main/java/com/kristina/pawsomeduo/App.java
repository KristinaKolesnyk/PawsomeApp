package com.kristina.pawsomeduo;
import com.kristina.common.AppManager;

public class App extends AppManager {
    @Override
    public void onCreate() {
        super.onCreate();
        statsClass = DogActivity.class;
        initializeStatsClass();
    }

    @Override
    protected void initializeStatsClass() {
        if (statsClass == null) {
            // Default to AppActivity if statsClass is null
            statsClass = DogActivity.class;
        }
    }
}

package com.kristina.common;

import android.app.Application;

import com.kristina.common.utils.MSP;

public abstract class AppManager extends Application {

    protected static Class<?> statsClass;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeStatsClass();
        // MySignalV2.initHelper(this);
        MSP.initHelper(this);
    }

    protected void initializeStatsClass() {
        // Do nothing by default
    }
}

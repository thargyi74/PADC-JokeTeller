package com.thargyi.exerciseweek3;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dell on 23-Jun-16.
 */
public class PADCWeek3ExerciseApp extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        context = null;
    }

    public static Context getContext(){
        return context;
    }
}

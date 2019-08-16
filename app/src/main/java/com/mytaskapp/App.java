package com.mytaskapp;

import android.app.Application;

import androidx.room.Room;

import com.mytaskapp.room.AppDatabase;

public class App extends Application {

    public static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this,AppDatabase.class,"my_database")
                .allowMainThreadQueries()
                .build();
    }

    public static AppDatabase getDatabase() {
        return database;
    }
}

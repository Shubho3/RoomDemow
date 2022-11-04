package com.example.roomdemo.RomDataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserRoom.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    
}
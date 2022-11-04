package com.example.roomdemo.RomDataBase;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM userroom")
    List<UserRoom> getAll();
    @Query("SELECT * FROM userroom WHERE uid IN (:userIds)")
    List<UserRoom> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM userroom WHERE email LIKE :email AND name LIKE :name LIMIT 1")
    UserRoom findByName(String name, String email);

    @Insert
    void insertAll(UserRoom... users);

    @Delete
    void delete(UserRoom user);
}


package com.mytaskapp.room;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.mytaskapp.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task ORDER by id DESC ")
    List<Task> getAll();


    @Insert
    void insert(Task task);

    @Delete
    void delete(Task task);

    @Update
    void update(Task task);

}

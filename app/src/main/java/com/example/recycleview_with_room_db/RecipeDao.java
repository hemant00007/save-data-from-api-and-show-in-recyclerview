package com.example.recycleview_with_room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface RecipeDao {
    @Query("SELECT * FROM Recipe")
    List<Recipe> getAll();

    @Insert
    void insert(Recipe recipe);
}

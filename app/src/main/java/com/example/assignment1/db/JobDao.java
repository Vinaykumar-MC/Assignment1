package com.example.assignment1.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Single;


@Dao
public abstract class JobDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insert(JobEntity job);

    @Query("SELECT * FROM jobsData")
    public abstract Single<List<JobEntity>> getAllBookmarks();

    @Query("SELECT COUNT(id) FROM jobsData")
    public abstract int getBookmarkedCount();

    @Query("DELETE FROM jobsData WHERE id = :id")
    public abstract void deleteJobById(int id);
}

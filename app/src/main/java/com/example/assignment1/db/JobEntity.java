package com.example.assignment1.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.example.assignment1.common.model.Result;
@TypeConverters(com.example.assignment1.db.TypeConverters.class)
@Entity(tableName = "jobsData")
public class JobEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;


private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JobEntity{" +
                "id=" + id +
                ", result=" + result +
                '}';
    }
}


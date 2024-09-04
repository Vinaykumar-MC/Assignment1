package com.example.assignment1.db;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static java.util.Objects.isNull;

import androidx.room.TypeConverter;


import com.example.assignment1.common.model.Result;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class TypeConverters {
    static Gson objectMapper = new Gson();

    @TypeConverter
    public static Result stringToLotSearchResponse(String data)  {
        if(isBlank(data)){
            return null;
        }
        try {

            return objectMapper.fromJson(data, Result.class);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @TypeConverter
    public static String lotSearchResponseToString(Result data)  {
        if(isNull(data)){
            return null;
        }
        try {
            return objectMapper.toJson(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

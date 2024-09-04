package com.example.assignment1.db;
    import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(version = 1,entities = {JobEntity.class})
public abstract class JobDataBase extends RoomDatabase{

        public abstract JobDao getJobDao();

        private static volatile JobDataBase  JOB_INSTANCE;

        public static JobDataBase getDatabase(final Context context) {
            if (JOB_INSTANCE == null) {
                synchronized (JobDataBase.class) {
                    if (JOB_INSTANCE == null) {
                        JOB_INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                        JobDataBase.class, "district_database")
                                .fallbackToDestructiveMigration()
                                .build();
                    }
                }
            }
            return JOB_INSTANCE;
        }
}

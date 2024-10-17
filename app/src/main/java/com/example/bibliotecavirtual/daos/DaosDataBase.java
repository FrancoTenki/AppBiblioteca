package com.example.bibliotecavirtual.daos;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.bibliotecavirtual.Book;

@Database(entities = {Book.class},version = 1)
public abstract class DaosDataBase extends RoomDatabase {

    private static DaosDataBase dbInstance;

    public abstract BookDAOS bookDAOS();

    public static DaosDataBase getInstance(Context context){
        if(dbInstance==null){
            dbInstance= Room.databaseBuilder(context,DaosDataBase.class,"database-books")
                    .allowMainThreadQueries()
                    .build();
        }
        return dbInstance;
    }
}

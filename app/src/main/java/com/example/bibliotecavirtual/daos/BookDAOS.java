package com.example.bibliotecavirtual.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.bibliotecavirtual.Book;

import java.util.List;

@Dao
public interface BookDAOS {

    @Query("SELECT * FROM books")
    List<Book> getAll();

    @Insert
    long insert(Book book);
}

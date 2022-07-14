package com.example.android.bookhub.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.android.bookhub.database.BookEntity as BookEntity

@Dao
interface BookDao {

    @Insert
    fun insertBook(bookEntity:BookEntity)

    @Delete
    fun deleteBook(bookEntity: BookEntity)

    @Query("SELECT * FROM books")
    fun getAllBook():List<BookEntity>

    @Query("SELECT * FROM books WHERE book_id= :bookId")
    fun getBookById(bookId:String):BookEntity
}
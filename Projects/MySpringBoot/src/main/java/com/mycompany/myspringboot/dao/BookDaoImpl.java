package com.mycompany.myspringboot.dao;

import com.mycompany.myspringboot.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void removeBook(int id) {

    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

    @Override
    public List<Book> listBooks() {
        return List.of();
    }
}

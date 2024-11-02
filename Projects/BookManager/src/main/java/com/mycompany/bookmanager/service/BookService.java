package com.mycompany.bookmanager.service;

import com.mycompany.bookmanager.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> listBooks();
}

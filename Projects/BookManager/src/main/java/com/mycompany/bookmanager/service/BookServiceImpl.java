package com.mycompany.bookmanager.service;

import com.mycompany.bookmanager.dao.BookDao;
import com.mycompany.bookmanager.model.Book;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    //@Autowired
    private BookDao bookDao;

    //@Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);

    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);

    }

    @Override
    public void removeBook(int id) {

    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }
}

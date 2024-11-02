package com.mycompany.bookmanager.service;

import com.mycompany.bookmanager.dao.BookDao;
import com.mycompany.bookmanager.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    @Transactional
    public void addBook(Book book) {

    }

    @Override
    @Transactional
    public void updateBook(Book book) {

    }

    @Override
    @Transactional
    public void removeBook(int id) {

    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }
}

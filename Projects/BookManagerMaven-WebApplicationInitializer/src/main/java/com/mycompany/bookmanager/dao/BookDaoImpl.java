package com.mycompany.bookmanager.dao;

import com.mycompany.bookmanager.model.Book;
/*import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    //private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
        //logger.info("book successfully saved. Book details: " + book);
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
    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        Session session = sessionFactory.getCurrentSession();
        List<Book> bookList = session.createQuery("From Book").list();
        /*for (Book book : bookList){
            logger.info("Book list: " + book);
        }*/
        return bookList;
    }
}

package com.mycompany.bookmanager.dao;

import com.mycompany.bookmanager.model.Book;
import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class BookDaoImpl implements BookDao{
    private static final Logger logger = Logger.getLogger(BookDaoImpl.class.getName());
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBook(Book book) {
        Session session = (Session) this.sessionFactory.getSession("jdbc:mysql://localhost:3306/bookmanager");
        session.persist(book);
        logger.info("book successfully saved. Book details: " + book);
    }

    @Override
    public void updateBook(Book book) {
        Session session = (Session) this.sessionFactory.getSession("jdbc:mysql://localhost:3306/bookmanager");
        session.update(book);
        logger.info("book successfully update. Book details: " + book);

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
        Session session = (Session) this.sessionFactory.getSession("jdbc:mysql://localhost:3306/bookmanager");
        List<Book> bookList = session.createQuery("From Book").list();
        for (Book book : bookList){
            logger.info("Book list: " + book);
        }
        return bookList;
    }
}

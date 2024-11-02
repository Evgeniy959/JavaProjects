package com.mycompany.testmvs.dao;

import com.mycompany.testmvs.config.HibernateSessionFactoryUtil;
import com.mycompany.testmvs.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;
@Repository
public class BookDao {
    //SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(com.mycompany.testmvs.model.Book.class).buildSessionFactory();

    public List<Book> listBooks() {
        //Session session = sessionFactory.getCurrentSession();
        //Session session = sessionFactory.openSession();
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> bookList = session.createQuery("From Book").list();
        return bookList;
    }

    public void add(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }
}

package com.mycompany.testmvs.controller;

import com.mycompany.testmvs.config.HibernateSessionFactoryUtil;
import com.mycompany.testmvs.dao.BookDao;
import com.mycompany.testmvs.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    //BookDao bookDao = new BookDao();
    @Autowired
    private BookDao bookDao;

//    private SessionFactory sessionFactory;
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    //SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(com.mycompany.testmvs.model.Book.class).buildSessionFactory();
    @GetMapping("/books")
    //@RequestMapping(value = "/books", method = RequestMethod.GET)
    //@Transactional
    public String listBooks(Model model){
        //Session session = sessionFactory.getCurrentSession();
        //Session session = sessionFactory.openSession();
        //Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> bookList = bookDao.listBooks();
        model.addAttribute("listBooks", bookList);
        return "books";
    }
    @GetMapping("/films")
    public String films(){
        Book book = new Book();
        book.setBookAuthor("Aperin");
        book.setBookTitle("Rusha");
        book.setPrice(600);
        bookDao.add(book);
        return "films";
    }
}

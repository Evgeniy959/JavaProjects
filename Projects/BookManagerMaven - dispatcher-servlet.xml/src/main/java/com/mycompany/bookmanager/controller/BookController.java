package com.mycompany.bookmanager.controller;

import com.mycompany.bookmanager.model.Book;
import com.mycompany.bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    private BookService bookService;
    private static Book book;

    static {
        book = new Book();
        book.setBookAuthor("Pushkin");
        book.setBookTitle("Ruslan and Liudmila");
        book.setPrice(500);
    }

    //@Autowired(required = true)
    @Autowired
    //@Qualifier(value = "bookServiceImpl")
    public void setBookService(BookService bookService) {
        //public void setBookService(@Qualifier(value = "bookServiceImpl") BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    //@RequestMapping(value = "/books", method = RequestMethod.GET)
    public String listBooks(Model model){
        //model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.bookService.listBooks());
        return "books";
    }
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public ModelAndView allBooks() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book");
        modelAndView.addObject("book", book);
        return modelAndView;
    }
}

package com.mycompany.bookmanager.controller;

import com.mycompany.bookmanager.model.Book;
import com.mycompany.bookmanager.service.BookService;
import jakarta.mvc.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Component
public class BookController {
    //@Autowired
    private BookService bookService;

    @Autowired(required = true)
    @Qualifier(value = "bookServiceImpl")
    public void setBookService(BookService bookService) {
    //public void setBookService(@Qualifier(value = "bookServiceImpl") BookService bookService) {
        this.bookService = bookService;
    }
    //@GetMapping("/books")
    @RequestMapping(value = "books", method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("listBooks", this.bookService.listBooks());
        return "books";
    }
}

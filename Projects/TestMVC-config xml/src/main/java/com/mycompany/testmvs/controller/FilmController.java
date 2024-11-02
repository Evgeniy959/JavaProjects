package com.mycompany.testmvs.controller;

import com.mycompany.testmvs.model.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class FilmController {
    private static Film film;

    static {
        film = new Film();
        film.setTitle("Inception");
        film.setYear(2010);
        film.setGenre("sci-fi");
        film.setWatched(true);
    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allFilms() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("films");
//        modelAndView.addObject("film", film);
//        return modelAndView;
//    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Films(Model model) {
        model.addAttribute("film", film);
        //model.addAttribute("listBooks", this.bookService.listBooks());
        return "films";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}

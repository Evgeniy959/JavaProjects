package com.mycompany.testmvs;

import com.mycompany.testmvs.dao.BookDao;
import com.mycompany.testmvs.model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bookmanager";
        String username = "root";
        String password = "Tdutbq21@sql";
        System.out.println("Connecting...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
//        BookDao bookDao = new BookDaoImpl();
//        Book book = new Book();
//        book.setBookAuthor("Pushkin");
//        book.setBookTitle("Ruslan and Liudmila");
//        book.setPrice(500);
//        try {
//            bookDao.addBook(book);
//            System.out.println("Add book successful!");
//        } catch (NullPointerException e) {
//            System.out.println("Add book failed!");
//            e.printStackTrace();
//        }
        /*bookDao.addBook(book);
        System.out.println("Add book successful!");*/

        BookDao bookDao = new BookDao();
        Book book = new Book();
        book.setBookAuthor("Letov");
        book.setBookTitle("Ruslan new");
        book.setPrice(700);
        try {
            bookDao.add(book);
            System.out.println("Add book successful!");
        } catch (NullPointerException e) {
            System.out.println("Add book failed!");
            e.printStackTrace();
        }
        try {
            bookDao.listBooks();
            System.out.println("Books successful!");
        } catch (NullPointerException e) {
            System.out.println("Books failed!");
            e.printStackTrace();
        }
        for (Book book1 : bookDao.listBooks()){
            System.out.println(book1);
        }
        /*bookDao.addBook(book);
        System.out.println("Add book successful!");*/
    }


}


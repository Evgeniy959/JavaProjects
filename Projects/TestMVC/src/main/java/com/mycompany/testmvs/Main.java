package com.mycompany.testmvs;

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
    }
}

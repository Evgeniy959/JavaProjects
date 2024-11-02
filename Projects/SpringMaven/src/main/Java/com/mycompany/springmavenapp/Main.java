package com.mycompany.springmavenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Okey");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student) context.getBean("student");
        s1.setName("Robert");
        s1.setRate(145.5);
        System.out.println(s1);
        Student s2 = context.getBean(Student.class);
        System.out.println(s2);

        Group g=(Group)context.getBean("group");
        g.setName("SP2824");
        Student s=null;
        Random r=new Random();
        String j;
        for (int i = 0; i < 10; i++)
        {
            s=(Student)context.getBean("student");
            j=String.valueOf((i+1));
            s.setName("Student "+j);
            s.setRate(r.nextInt(100));
            g.addStudent(s);
        }
        System.out.println(g);
    }
}

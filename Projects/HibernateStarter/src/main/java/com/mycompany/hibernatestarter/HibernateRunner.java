package com.mycompany.hibernatestarter;


import com.mycompany.hibernatestarter.converter.BirthdayConverter;
import com.mycompany.hibernatestarter.entity.Birthday;
import com.mycompany.hibernatestarter.entity.Role;
import com.mycompany.hibernatestarter.entity.User;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAttributeConverter(new BirthdayConverter(), true);
        configuration.addAnnotatedClass(User.class);
        //configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        try(var sessionFactory = configuration.buildSessionFactory();
            var session = sessionFactory.openSession();) {
            session.beginTransaction();
            User user = User.builder()
                    .username("evgp3@mail.ru")
                    .firstname("Ivan5")
                    .lastname("Ivanov5")
                    .birthDate(new Birthday(LocalDate.of(2000, 02, 25)))
                    //.age(34)
                    .role(Role.ADMIN)
                    .build();
            //session.save(user);
            //session.update(user);
            //session.saveOrUpdate(user);
            //session.delete(user);
            User user1 = session.get(User.class, "evgp4@mail.ru");
            System.out.println(user1);
            session.getTransaction().commit();

        }
    }
}
package com.mycompany.hibernatestarter;

import com.mycompany.hibernatestarter.entity.Role;
import com.mycompany.hibernatestarter.entity.User;
import org.junit.jupiter.api.Test;

import javax.persistence.Column;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class HibernateRunnerTest {
    @Test
    public void testHibernateApi() throws SQLException, IllegalAccessException {
        /*var user = User.builder()
                .username("evgp1@mail.ru")
                .firstname("Ivan1")
                .lastname("Ivanov")
                .birthDate(LocalDate.of(2000, 02, 25))
                .age(34)
                //.role(Role.ADMIN)
                .build();
        var sql = """
                insert INTO
                %s
                (%s)
                values
                (%s)
                """;
        var tableName = Optional.ofNullable(user.getClass().getAnnotation(Table.class))
                .map(table -> table.schema()+"."+table.name())
                .orElse(user.getClass().getName());
        Field[] fields = user.getClass().getDeclaredFields();
        var columnNames = Arrays.stream(fields)
                .map(field -> Optional.ofNullable(field.getAnnotation(Column.class))
                        .map(Column::name)
                        .orElse(field.getName())
                        ).collect(Collectors.joining(","));
        var columnValues = Arrays.stream(fields)
                .map(field -> "?")
                .collect(Collectors.joining(","));
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","hiberdb");
        PreparedStatement preparedStatement = connection.prepareStatement(sql.formatted(tableName, columnNames, columnValues));
        for (int i = 0; i<fields.length; i++){
            fields[i].setAccessible(true);
            preparedStatement.setObject(i+1, fields[i].get(user));
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();*/
    }

}
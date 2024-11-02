package org.example.data;

import java.util.List;

public interface TodoService {
    // метод возвращает список задач пользователя
    public List<String> retrieveTodos(String user);
    // метод удаляет задачу из списка задач
    public void deleteTodo(String todo);
}

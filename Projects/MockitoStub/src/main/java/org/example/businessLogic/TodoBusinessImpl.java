package org.example.businessLogic;

import org.example.data.TodoService;

import java.util.ArrayList;
import java.util.List;

// класс реализует какую-то бизнес-логику на основе задач пользователя
public class TodoBusinessImpl {
    private TodoService todoService; // приватное поле — список задач
    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }
    // метод, который будем тестировать: отбирает среди задач пользователя те, которые относятся к Spring
    public List<String> retrieveTodosRelatedToSpring(String user){
        List<String> filteredTodos=new ArrayList<String>();
// вызов метода, реализации которого еще нет
        List<String> todos=todoService.retrieveTodos(user);
        for(String todo:todos) {
            if(todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    // еще один тестируемый метод - удалить из списка задачи, не связанные со Spring
    public void deleteTodosNotRelatedToSpring(String user) {
        List<String> todos=todoService.retrieveTodos(user);
        for(String todo:todos) {
            if(!todo.contains("Spring")) {
                todoService.deleteTodo(todo);
            }
        }
    }
}

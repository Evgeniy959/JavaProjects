package data;

import org.example.data.TodoService;

import java.util.Arrays;
import java.util.List;

// стаб - класc, который дает простую реализацию
// интерфейса TodoService для тестирования TodoBusinessImpl
public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}

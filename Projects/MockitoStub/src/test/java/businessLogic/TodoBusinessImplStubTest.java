package businessLogic;

import data.TodoServiceStub;
import org.example.businessLogic.TodoBusinessImpl;
import org.example.data.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {
    @Test
    public void testWithStub() {
// создание заглушки
        TodoService todoServiceStub=new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl=
                new TodoBusinessImpl(todoServiceStub);
        List filteredTodos = todoBusinessImpl.
                retrieveTodosRelatedToSpring("Dummy");
// проверка, что в отфильтрованном списке два элемента
        assertEquals(2,filteredTodos.size());
    }
}

package businessLogic;

import org.example.businessLogic.TodoBusinessImpl;
import org.example.data.TodoService;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TodoBusinessImplMockTest {
    @Test
    public void testWithMock() {
// создание мока
        TodoService todoServiceMock = mock(TodoService.class);
        // описание поведения мока
        List<String> todos = Arrays.asList(
                "Learn Spring MVC",
                "Learn Spring",
                "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).
                thenReturn(todos);
// создание тестируемого объекта, взаимодействующего с моком
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todoServiceMock);
// запуск тестируемого метода
        List filteredTodos = todoBusinessImpl.
                retrieveTodosRelatedToSpring("Dummy");
// проверка, что в отфильтрованном списке два элемента
        assertEquals(2, filteredTodos.size());
    }

    // тест для метода deleteTodosNotRelatedToSpring()
    @Test
    public void testWithDeleteTodos() {
// Arrange - настройка условий для теста создание заглушки
        TodoService todoServiceMock=mock(TodoService.class);
// настройка мока
        List<String> todos=Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
// cоздание тестируемого объекта
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
// Act - запуск метода
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
// Assert - проверка, что метод мока deleteTodo() вызывался с параметром "Learn to Dance"
        verify(todoServiceMock).deleteTodo("Learn to Dance");
        // проверка, что метод не будет вызван с параметром Learn Spring
        verify(todoServiceMock, never()).deleteTodo("Learn Spring");
        // проверка, что метод с данным параметром вызывается один раз
        verify(todoServiceMock,times(1)).deleteTodo("Learn to Dance");
        // проверка, что метод вызывается по крайней мере один раз
        verify(todoServiceMock,atLeastOnce()).deleteTodo("Learn to Dance");
// другой вариант того же
        verify(todoServiceMock,atLeast(1)).deleteTodo("Learn to Dance");
    }

    // тест с захватом аргумента для метода
// deleteTodosNotRelatedToSpring()
    @Test
    public void testWithDeleteTodos2() {
// Объявить "захватчика" аргумента
        ArgumentCaptor<String> stringArgCaptor = ArgumentCaptor.forClass(String.class);
// создание и настройка мока
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
// Запуск тестируемого метода
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
        // захват аргумента в вызываемом методе мока
        verify(todoServiceMock).deleteTodo(stringArgCaptor.capture());
// проверка, что захваченный аргумент - это строка "Learn to Dance"
        assertThat(stringArgCaptor.getValue(), is("Learn to Dance"));
    }

    // тест с захватом нескольких аргументов для метода deleteTodosNotRelatedToSpring()
    @Test
    public void testWithDeleteTodos3() {
// Объявить "захватчика" аргумента
        ArgumentCaptor<String> stringArgCaptor = ArgumentCaptor.forClass(String.class);
// создание и настройка мока
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn to Rock and Roll",
                        "Learn Spring",
                        "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).
                thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todoServiceMock);
// Запуск тестируемого метода
        todoBusinessImpl.deleteTodosNotRelatedToSpring("Dummy");
// множественный захват аргумента в вызываемом методе мока
        verify(todoServiceMock,times(2)).
                deleteTodo(stringArgCaptor.capture());
// проверка количества захваченных аргументов
        assertThat(stringArgCaptor.getAllValues().size(),is(2));
    }

    // тест для метода deleteTodosNotRelatedToSpring()
    @Test
    public void testWithDeleteTodosErr() {
// Arrange - настройка условий для теста
        TodoService todoServiceMock=mock(TodoService.class);
        List<String> todos =
                Arrays.asList("Learn Spring MVC","Learn Spring",
                        "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).
                thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todoServiceMock);
// Act - запуск метода
        todoBusinessImpl.
                deleteTodosNotRelatedToSpring("Dummy");
// Assert - проверка, что метод мока deleteTodo
// вызывался с параметром "Learn Spring"
        verify(todoServiceMock).deleteTodo("Learn Spring");
    }

}
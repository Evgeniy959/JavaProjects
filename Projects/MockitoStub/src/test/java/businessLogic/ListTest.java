package businessLogic;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
public class ListTest {
    @Test
    public void listTest() {
// создание мока,подменяющего List
        List listMock = Mockito.mock(List.class);
        // настройка: при вызове метода size() должно возвращаться 2
        Mockito.when(listMock.size()).thenReturn(2);
// вызов size() и проверка, что результат 2
        assertEquals(2,listMock.size());
    }
    @Test
    public void listTestMultiple() {
// создание мока,подменяющего List
        List listMock = mock(List.class);
// настройка: при вызове метода size()
// первый раз должно возвращаться 2
// а второй и последующие разы 3
        when(listMock.size()).thenReturn(2).thenReturn(3);
// вызов size() и проверки
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
        assertEquals(3,listMock.size());
    }
    @Test
    public void listTestGet() {
// создание мока,подменяющего List
        List listMock = mock(List.class);
// настройка: при вызове метода get(0)
// должна возвращаться строка "result"
        when(listMock.get(0)).thenReturn("result");
// вызов get() и проверка, что результат "result"
        assertEquals("result",listMock.get(0));
        assertEquals(null,listMock.get(1)); // по умолчанию
// результат null
    }
    @Test
    public void listTestGetAnyParametr() {
// создание мока,подменяющего List
        List listMock=mock(List.class);
// настройка: при вызове метода get() c любым целым параметром должна возвращаться строка "result"
        when(listMock.get(anyInt())).thenReturn("result");
        // вызов get() и проверка, что результат "result"
        assertEquals("result",listMock.get(0));
        assertEquals("result",listMock.get(1));
    }


    @Test(expected=RuntimeException.class)
    public void listExceptonTest() {
// создание мока,подменяющего List
        List listMock=mock(List.class);
// настройка: при вызове метода get() c любым целым параметром должно выбрасываться исключение
        when(listMock.get(anyInt())).thenThrow(new RuntimeException(
                        "Some message"));
        listMock.get(0);//здесь возникает исключение
    }
}

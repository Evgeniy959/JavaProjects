package businessLogic;

import org.example.businessLogic.MyCalc;
import org.example.businessLogic.TodoBusinessImpl;
import org.example.data.MyCalcService;
import org.example.data.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyCalclMockTest {
    @Test(expected=RuntimeException.class)
    public void MyCalcExceptonTestDiv() {
// создание мока
        MyCalcService myCalcServiceMock = mock(MyCalcService.class);
        MyCalc myCalc = new MyCalc(myCalcServiceMock);
// настройка: при вызове метода div() cо вторым параметром 0 должно выбрасываться исключение
        when(myCalc.myDiv(anyDouble(),0)).thenThrow(new RuntimeException("Some message"));
        myCalc.myDiv(5.4, 0);//здесь возникает исключение
    }

}
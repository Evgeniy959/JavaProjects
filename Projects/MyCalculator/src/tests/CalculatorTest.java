package tests;

import mycalc.Calculator;
import mycalc.DivByZeroException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

import java.io.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc=new Calculator();
    }
    @After
    public void tearDown() {
        calc=null; // удаление объекта после теста
    }

    @Test
    public void testAdd() {
        double result=calc.add(8,2); // act: выполнение метода
        assertEquals(10, result,1e-9); // assert: проверка
    }

    @Test
    public void testSub() {
        double result=calc.sub(8,2);
        assertEquals(6, result,1e-9);
    }

    @Test
    public void testMult() {
        double result=calc.mult(8,2);
        assertEquals(16, result,1e-9);
    }

    @Test
    public void testDiv() throws DivByZeroException {
        double result=calc.div(8,2);
        assertEquals(4, result,1e-9);
    }
    @Test(expected= DivByZeroException.class)
    public void testDivByZero() throws DivByZeroException{
        double result=calc.div(8,0);
    }

    @Test
    public void testDivByZeroMessage() {
        try {
            double result=calc.div(8,0);
            fail("Division by Zero should have thrown a DivByZeroException");
        }
        catch(DivByZeroException e){
            assertEquals("Division by Zero",
                    e.getMessage());
        }
        catch(Exception e) {
            fail("Should be DivByZeroException, but have " + e.getClass());
        }
    }

    @Rule
    public final TemporaryFolder folder=new TemporaryFolder();
    @Test
    public void testTempFile() throws IOException {
        double result;
        //File tempFile = folder.newFile();// задание файла во временной папке
        File tempFile = folder.newFile("myfile.txt");// задание файла во временной папке
        FileWriter writer = new FileWriter(tempFile); // поток записи в файл
        for (int i = 2; i < 10; i++) {
            result = calc.mult(3, i); // вычисление
// произведения на 3
            String str = result + " ";
            writer.write(str); // запись в файл
        }
        writer.close(); // закрыть файл записи
        BufferedReader reader =
                new BufferedReader(new FileReader(tempFile));
        String str = reader.readLine(); // чтение всех данных
        reader.close();
        String[] numbers = str.split(" "); // разделение на
// строки-числа
        for (int i = 0; i < 8; i++) {
            result = Double.parseDouble(numbers[i]); //
// преобразование в число
            assertEquals(3 * (i + 2), result, 1e-9);// проверка
        }
    }
    @Rule
    public final ExpectedException exception =
            ExpectedException.none(); // пустое исключение
// другие тесты без генерации исключений
    @Test
    public void testDivByZero2() throws DivByZeroException
    {
        exception.expect(DivByZeroException.class); //настройка ожидаемого класса исключения
        exception.expectMessage("Division by Zero"); //настройка ожидаемого сообщения в исключении
        double result=calc.div(8,0); // здесь появляется исключение
    }
    @Rule
    public final Timeout globalTimeOut=Timeout.millis(200);
    @Test
    public void testTimeOut() throws InterruptedException{
        for(long i=1;i<10;i++) {
            double result=calc.mult(i, i+1);
            double expected=i*(i+1);
            assertEquals(expected,result,1e-9);
            Thread.sleep(2);
        }
    }
}
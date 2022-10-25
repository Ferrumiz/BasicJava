package junitlesson;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    // assertEquals(то, что вы знаете какое значение должно быть, результат работы метода(или другой результат);
    // assertArrayEquals - сравнивает массивы
    // assertTrue , assertFalse
    // @Disabled - отключает тест
    // @BeforeEach - указывает на то, что метод должен вызываться перед вызовом каждого тестового метода
    // @AfterEach - выполняется в конце тестового метода, чтобы закрыть либо вычистить какие-л. ресурсы
    // @BeforeAll - вызывается один раз перед всеми, работает для static
    // @AfterAll - вызывается один раз после всех, работает для static
    // @Timeout - позволяет ограничить время выполнения методов и избежать подвисаний

    private Calc calc = null;

    @Test
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    public void add() {
        int result = calc.add(5, 6);

        assertEquals(11, result);
    }

    @BeforeAll
    private void init1() {
        calc = new Calc();
        System.out.println("Before All");
    }

    @AfterAll
    private void closeResources1() {
        System.out.println("Close");
    }

    @BeforeEach
    private void init() {
        calc = new Calc();
    }

    @AfterEach
    private void closeResources() {
        System.out.println("Close");
    }

    @org.junit.jupiter.api.Test
    public void add1() {
        int result = calc.add(6, 5);
        assertEquals(11, result);
    }

    @org.junit.jupiter.api.Test
    public void division() {
        int division = calc.division(6, 2);
        assertEquals(3, division);
    }

    @Test
    public void divisionWhenSecondParameterIsZero() {
        IncorrectParameterException secondParameterException = assertThrows(IncorrectParameterException.class,
                () -> calc.division(6, 0)
        );
        assertEquals("Division by zero", secondParameterException.getMessage());
    }

    @Test
    @Disabled
    public void divisionWhenFirstParameterIsNegative() {
        IncorrectParameterException secondParameterException = assertThrows(IncorrectParameterException.class,
                () -> calc.division(-6, 6)
        );
        assertEquals("Negative parameter - a", secondParameterException.getMessage());
    }

    @Test
    public void divisionWhenSecondParameterIsNegative() {
        IncorrectParameterException secondParameterException = assertThrows(IncorrectParameterException.class,
                () -> calc.division(6, -2)
        );
        assertEquals("Negative parameter - b", secondParameterException.getMessage());
    }
}
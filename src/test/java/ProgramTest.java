import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class ProgramTest {
    private final int age;
    private final boolean result;

    public ProgramTest(int age, boolean result) {
        // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                { 34, true},
                { 23, true}, // Заполни массив тестовыми данными и ожидаемым результатом
                { 21, true},
                { 28, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Возраст меньше 21 лет!", result, isAdult);

    }
}

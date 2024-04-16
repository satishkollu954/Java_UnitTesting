import org.example.MyCalculator;
import org.junit.jupiter.api.*;

public class MyCalculatorTest {

    @Test
    void addTest()
    {
        Assertions.assertEquals(1100,MyCalculator.add(1000,100));
    }

    @Test
    void subTest()
    {
        Assertions.assertEquals(10, MyCalculator.sub(10, 20));
    }

    @Test
    void mulTest()
    {
        Assertions.assertEquals(4,MyCalculator.mul(2,2));
    }
}

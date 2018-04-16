package calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class OurCoolTest {

    @BeforeClass
    public void before() {
        System.out.println("Before class method");
    }

    @Test
    public void checkParameters() {
        System.out.println("Test method");
        Calculator calculator = new Calculator(2, 2);
        int result = calculator.getResult();
        assertTrue("Результат(" + result + ") не равен 4", result == 4);
    }

    @Test
    public void checkMoreParameters() {
        System.out.println("Second test method");
        Calculator calculator = new Calculator(3, 3);
        int result = calculator.getResult();
        assertTrue("Результат(" + result + ") не равен 9", result == 9);
    }

    @AfterClass
    public void after() {
        System.out.println("After class method");
    }
}

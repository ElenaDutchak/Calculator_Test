package calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class OurCoolTest {

    @DataProvider(name = "calculatorDataProvider")
    public Object[][] simpleDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {2, 0, 0},
                {-1, 2, -2},
                {0, 2, 0}
        };
    }
    @Test(dataProvider = "calculatorDataProvider")
    public void checkParameters(int firstParam, int secondParam, int expectedResult) {
        Calculator calculator = new Calculator(firstParam, secondParam);
        int result = calculator.getResult();
        assertTrue("Результат(" + result + ") не равен " + expectedResult, result == expectedResult);
    }

}

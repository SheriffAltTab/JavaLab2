import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionCalculatorTest {

    @Test
    public void testCalculate() {
        assertEquals(Math.pow(Math.cos(3.4), 2), FunctionCalculator.calculate(3.4), 1e-6);
        assertEquals(Math.sin(3.5) * Math.log10(3.5), FunctionCalculator.calculate(3.5), 1e-6);
    }
}
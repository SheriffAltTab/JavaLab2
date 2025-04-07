import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionTabulationTest {
    @Test
    public void testTabulation() {
        Tabulation tabulation = new Tabulation(2, 5, 0.005);
        assertEquals((int) ((5 - 2) / 0.005) + 1, tabulation.getSize());
        assertNotNull(tabulation.getX(0));
        assertNotNull(tabulation.getY(0));
    }
}
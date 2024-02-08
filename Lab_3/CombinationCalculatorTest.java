import org.example.CombinationCalculator;
import org.example.HandleExceptions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CombinationCalculatorTest
{
    @Test
    public void testingNormalOutputOne()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(10, combinationCalculator.combination(5, 2));
    }

    @Test
    public void testingNormalOutputTwo()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(66, combinationCalculator.combination(12, 10));
    }

    @Test
    public void testingNormalOutputThree()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(1, combinationCalculator.combination(6, 6));
    }

    @Test
    public void testingNormalOutputFour()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(105, combinationCalculator.combination(15, 2));
    }

    @Test
    public void testingNormalOutputFive()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(15, combinationCalculator.combination(15, 14));
    }

    @Test
    public void testingNormalOutputSix()
    {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertEquals(1, combinationCalculator.combination(3, 0));
    }

    @Test
    public void testNonIntegerInput() {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertThrows(IllegalArgumentException.class, () -> combinationCalculator.combination(2.5, 3));
    }

    @Test
    public void testZeroNInput() {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        HandleExceptions handler = new HandleExceptions();
        assertThrows(IllegalArgumentException.class, () -> combinationCalculator.combination(0, 5));
    }

    @Test
    public void testNegativeInput() {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertThrows(IllegalArgumentException.class, () -> combinationCalculator.combination(-14, 5));
    }

    @Test
    public void testLargeInput() {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        assertThrows(IllegalArgumentException.class, () -> combinationCalculator.combination(1000, 5));
    }


}

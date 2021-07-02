package practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private static Fraction f1;
    private static Fraction f2;

    @BeforeAll
    public static void setUp(){
        f1 = new Fraction(2, 5);
        f2 = new Fraction(9, 2);
    }

    @Test
    public void testGetNumerator1() {
        assertEquals(2, f1.getNumerator(), "getNumerator fails for fraction 2/5");
    }

    @Test
    public void testGetNumerator2() {
        assertEquals(9, f2.getNumerator(), "getNumerator fails for fraction 9/2");
    }

    @Test
    public void testGetDenominator1() {
        assertEquals(5, f1.getDenominator(), "getDenominator fails for fraction 2/5");
    }

    @Test
    public void testGetDenominator2() {
        assertEquals(2, f2.getDenominator(), "getDenominator fails for fraction 9/2");
    }

    @Test
    public void testGetDoubleValue1() {
        assertEquals(0.4, f1.getDoubleValue(), .001, "getDoubleValue fails for fraction 2/5");
    }

    @Test
    public void testGetDoubleValue2() {
        assertEquals(4.5, f2.getDoubleValue(), .001, "getDoubleValue fails for fraction 9/2");
    }

    @Test
    public void testToString1() {
        assertEquals("2/5", f1.toString(), "toString fails for fraction 2/5");
    }

    @Test
    public void testToString2() {
        assertEquals("9/2", f2.toString(), "toString fails for fraction 9/2");
    }
}
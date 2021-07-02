package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionsHelperTest {

    @Test
    public void testOuncesToGallons1() {
        assertEquals(1.0, (new ConversionsHelper()).ouncesToGallons(128), .001, "ouncesToGallons fails for input 128");
    }

    @Test
    public void testOuncesToGallons2() {
        assertEquals(1.5, (new ConversionsHelper()).ouncesToGallons(192), .001, "ouncesToGallons fails for input 192");
    }

    @Test
    public void testCmToFeet1() {
        assertEquals(1.64042, (new ConversionsHelper()).cmToFeet(50), .001, "testCmToFeet fails for input 50");
    }

    @Test
    public void testCmToFeet2() {
        assertEquals(5.70866, (new ConversionsHelper()).cmToFeet(174), .001, "testCmToFeet fails for input 174");
    }
}
package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarCipherTest {

    @Test
    public void testEncrypt1() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "bcdefghijklmnopqrstuvwxyza";
        assertEquals(expected, (new CaesarCipher()).encrypt(input, 1), "encrypt fails for input " + input + " shift 1");
    }

    @Test
    public void testEncrypt2() {
        String input = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        String expected = "bcdefghijklmnopqrstuvwxyza".toUpperCase();
        assertEquals(expected, (new CaesarCipher()).encrypt(input, 1), "encrypt fails for input " + input + " shift 1");
    }

    @Test
    public void testEncrypt3() {
        String input = "a*b*";
        String expected = null;
        assertEquals(expected, (new CaesarCipher()).encrypt(input, 1), "encrypt fails for input " + input + " shift 1");
    }

    @Test
    public void testEncrypt4() {
        String input = "aBcwZZ";
        String expected = "fGhbEE";
        assertEquals(expected, (new CaesarCipher()).encrypt(input, 5), "encrypt fails for input " + input + " shift 5");
    }

}
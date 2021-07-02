package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayHelloTest {

    @Test
    public void testSayHello1() {
        assertEquals("Hello, Mickey!", (new SayHello()).sayHello("Mickey"), "sayHello fails for input Mickey");
    }

    @Test
    public void testSayHello2() {
        assertEquals("Hello, sansa!", (new SayHello()).sayHello("sansa"), "sayHello fails for input sansa");
    }
}
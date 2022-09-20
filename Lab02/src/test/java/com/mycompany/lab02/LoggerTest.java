
package com.mycompany.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LoggerTest {
    
    public LoggerTest() {
    }

    @Test
    public void testSomeMethod() {
        Logger log1 = Logger.getLogger();
        Logger log2 = Logger.getLogger();
        assertEquals(log1, log2);
    }
    
}

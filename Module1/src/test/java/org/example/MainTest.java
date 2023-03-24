package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testCheck() {
        Main m = new Main();
        assertEquals("Hello",m.check());
    }
}
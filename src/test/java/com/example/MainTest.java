package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void testCreateUser() {
        User user = Main.createUser("Hasan", 22);
        assertEquals("Hasan", user.getName());
        assertEquals(22, user.getAge());
    }
}

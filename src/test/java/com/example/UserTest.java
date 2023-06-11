package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User("Hasan", 25);
        assertEquals("User name should be Hasan", "Hasan", user.getName());
        assertEquals("User age should be 25", 25, user.getAge());

        user.setName("Updated User");
        user.setAge(30);
        assertEquals("User name should be Updated User", "Updated User", user.getName());
        assertEquals("User age should be 30", 30, user.getAge());
    }
}

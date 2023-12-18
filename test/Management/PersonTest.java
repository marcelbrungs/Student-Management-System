package Management;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testDisplayInfo() {
        Person person = new Person("John", 25);
        person.displayInfo();
    }

    @Test
    public void testConstructor() {
        Person person = new Person("Alice", 30);
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }
}

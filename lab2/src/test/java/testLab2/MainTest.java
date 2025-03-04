package testLab2;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {
    @Test
    void testListNotEmpty() {
        List<String> items = Lists.newArrayList("Ana", "Diana", "Darius");
        assertFalse(items.isEmpty(), "List should not be empty");
    }

    @Test
    void testListSize() {
        List<String> items = Lists.newArrayList("Ionut", "Lucian", "Apor");
        assertEquals(3, items.size(), "List should contain 3 items");
    }
}

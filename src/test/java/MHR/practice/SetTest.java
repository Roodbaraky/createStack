package MHR.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static MHR.practice.Set.createSet;

import org.junit.jupiter.api.Test;

class SetTest {

    @Test
    void setFromArray() {
        Object[] testArray = {"cat", "dog", "cat"};
        Set set = Set.setFromArray(testArray);
        assertEquals(2, set.size());
    }

    @Test
    void testCreateSet() {
        Set testSet = createSet();
        assertInstanceOf(Set.class, testSet);
    }

    @Test
    void testIsEmpty() {
        Set testSet = createSet();
        assertTrue(testSet.isEmpty());
    }

    @Test
    void testSize() {
        Set testSet = createSet();
        assertEquals(testSet.size(), 0);
    }

    @Test
    void testAdd() {
        Set testSet = createSet();
        testSet.add("cat");
        assertEquals("[cat]", testSet.toString());
        testSet.add("cat");
        testSet.add("dog");
        assertEquals("[cat, dog]", testSet.toString());
    }

    @Test
    void testRemove(){
        Set testSet = createSet();
        testSet.add("cat");
        assertEquals("[cat]", testSet.toString());
        testSet.remove("cat");
        assertTrue(testSet.isEmpty());
    }

    @Test
    void testCreateSetWithCapacity() {
        Set testSet = createSet(1);
        testSet.add("dog");
        testSet.add("cat");
        assertEquals("[dog]", testSet.toString());
    }

    @Test
    void testGetCapacity(){
        Set testSet = createSet(1);
        assertEquals (1, testSet.getCapacity());
    }
}
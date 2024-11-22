package MHR.practice;

import static org.junit.jupiter.api.Assertions.*;

import static MHR.practice.Stack.createStack;

import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    void testCreateStack() {
        Stack testStack = createStack();
        assertInstanceOf(Stack.class, testStack);
    }

    @Test
    void testCreateStackWithLimit() {
        Stack testStack = createStack(1);
        testStack.push("cat");
        testStack.push("cat");
        assert (testStack.getQuantity() == 1);
    }

    @Test
    void push() {
        Stack testStack = createStack();
        testStack.push((String) "cat");
        assert (!testStack.isEmpty());
    }

    @Test
    void pop() {
        Stack testStack = createStack();
        testStack.push("cat");
        assertEquals(testStack.pop(), "cat", "Should return the last item in the stack");
        assertTrue(testStack.isEmpty());
    }

    @Test
    void isEmpty() {
        Stack testStack = createStack();
        assertTrue(testStack.isEmpty());
        testStack.push("cat");
        assertFalse(testStack.isEmpty());
    }

    @Test
    void isFull() {
        Stack testStack = createStack(1);
        assertFalse(testStack.isFull(), "The stack should not be full");
        testStack.push("cat");
        assertTrue(testStack.isFull());
    }

    @Test
    void testPeek() {
        Stack testStack = createStack();
        testStack.push("cat");
        assertEquals(testStack.peek(), "cat", "Should return the last item in the stack");
        testStack.push("dog");
        assertEquals(testStack.peek(), "dog", "Should return the last item in the stack");
    }

    @Test
    void testGetQuantity() {
        Stack testStack = createStack();
        assert (testStack.getQuantity() == 0);
        testStack.push("cat");
        assert (testStack.getQuantity() == 1);
    }
}
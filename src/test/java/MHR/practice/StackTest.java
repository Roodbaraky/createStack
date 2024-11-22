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
    void push() {
        Stack testStack = createStack();
        testStack.push((String) "cat");
        assert (!testStack.isEmpty());
    }

    @Test
    void pop() {
        Stack testStack = createStack();
        testStack.push("cat");
        assertEquals (testStack.pop(), "cat","Should return the last item in the stack");
        assertTrue(testStack.isEmpty());
    }

    @Test
    void isEmpty() {
        Stack testStack = createStack();
        assertTrue(testStack.isEmpty());
    }

    @Test
    void isFull() {
        Stack testStack = createStack();
        assertFalse(testStack.isFull(), "The stack should not be full");
    }

    @Test
    void testPeek() {
        Stack testStack = createStack();
        testStack.push("cat");
        assertEquals (testStack.peek(), "cat","Should return the last item in the stack");
        testStack.push("dog");
        assertEquals (testStack.peek(), "dog","Should return the last item in the stack");

    }
}
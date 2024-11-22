package MHR.practice;

import static org.junit.jupiter.api.Assertions.*;

import static MHR.practice.Queue.createQueue;

import org.junit.jupiter.api.Test;

class QueueTest {

    @Test
    void testCreateQueue() {
        Queue testQueue = createQueue(1);
        assertTrue(testQueue.isEmpty());
    }


    @Test
    void testPeek() {
        Queue testQueue = createQueue(1);
        testQueue.enQueue("cat");
        assertSame("cat", testQueue.peek());
    }

    @Test
    void testIsEmpty() {
        Queue testQueue = createQueue(1);
        assertTrue(testQueue.isEmpty());
    }

    @Test
    void testIsFull(){
        Queue testQueue = createQueue(2);
        testQueue.enQueue("cat");
        assertFalse(testQueue.isFull());
        testQueue.enQueue("cat");
        assertTrue(testQueue.isFull());
    }


    @Test
    void testEnQueue() {
        Queue testQueue = createQueue(1);
        testQueue.enQueue("cat");
        assertFalse(testQueue.isEmpty());
        assert(testQueue.peek()=="cat");
    }

    @Test
    void testDeQueue() {
        Queue testQueue = createQueue(2);
        testQueue.enQueue("cat");
        testQueue.enQueue("dog");
        testQueue.deQueue();
        assert(testQueue.peek()=="dog");

    }
}
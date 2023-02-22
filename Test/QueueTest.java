import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    //Tests for length
    @Test
    void checklength1() {
        Queue queue = new Queue();
        queue.addToBack(100);
        assertEquals(1, queue.length());//length should be 1 to pass this test
    }

    @Test
    void checklength3() {
        Queue queue = new Queue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        assertEquals(3, queue.length());//length should be 3 to pass this test
    }

    @Test
    void checklength9() {
        Queue queue = new Queue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        queue.addToBack(97);
        queue.addToBack(96);
        queue.addToBack(95);
        queue.addToBack(94);
        queue.addToBack(93);
        queue.addToBack(92);

        assertEquals(9, queue.length());//length should be 9 to pass this test
    }

//In these tests below, I will test by adding integers back into the queue in various ways

    @Test
    void add0toBackofQueue() {
        Queue queue = new Queue();

        assertEquals("Empty List!", queue.printOut());
    }

    @Test
    void add1toBackofQueue() {
        Queue queue = new Queue();
        queue.addToBack(1);

        assertEquals("1\n-\n", queue.printOut());
    }

    @Test
    void add5toBackofQueue() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);


        assertEquals("1\n-\n2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());// queue be 5 integers long
    }

    //Tests below will test various ways integers are placed and taken away from the queue
    @Test
    void removeFromFront1() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();// should remove 1


        assertEquals("2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());// queue should start with 2
    }

    @Test
    void removeFromFront2() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();// should remove 1
        queue.removeFromFront();// should remove 2


        assertEquals("3\n-\n4\n-\n5\n-\n", queue.printOut());// queue should start with 3
    }

    @Test
    void removeFromFront3() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();// should remove 1
        queue.removeFromFront();// should remove 2
        queue.removeFromFront();// should remove 3


        assertEquals("4\n-\n5\n-\n", queue.printOut());// queue should start with 4
    }
}

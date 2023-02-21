import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    //Tests for length
    @Test
    void lengthShouldBe1() {
        Queue queue = new Queue();
        queue.addToBack(100);
        assertEquals(1, queue.length());
    }

    @Test
    void lengthShouldBe2() {
        Queue queue = new Queue();
        queue.addToBack(100);
        queue.addToBack(99);
        assertEquals(2, queue.length());
    }

    @Test
    void lengthShouldBe3() {
        Queue queue = new Queue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);

        assertEquals(3, queue.length());
    }

//Tests for adding integer to the q

    @Test
    void add0tobackof() {
        Queue queue = new Queue();

        assertEquals("Empty List!", queue.printOut());
    }

    @Test
    void add1toback() {
        Queue queue = new Queue();
        queue.addToBack(1);

        assertEquals("1\n-\n", queue.printOut());
    }

    @Test
    void add2toback() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);

        assertEquals("1\n-\n2\n-\n", queue.printOut());
    }

    @Test
    void add5toback() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);


        assertEquals("1\n-\n2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    //Tests for removeFromFront method
    @Test
    void remove1FromFront() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();


        assertEquals("2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    @Test
    void remove2FromFront() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();
        queue.removeFromFront();


        assertEquals("3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    @Test
    void remove3FromFront() {
        Queue queue = new Queue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();


        assertEquals("4\n-\n5\n-\n", queue.printOut());
    }

//Tests for length

    @Test
    void queueWith3substract1() {
        Queue queue = new Queue();

        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        queue.removeFromFront();

        assertEquals(2, queue.length());

    }


    @Test
    void queueWith3substract1add1() {
        Queue queue = new Queue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);

        queue.removeFromFront();

        queue.addToBack(100);

        assertEquals(3, queue.length());
    }
}

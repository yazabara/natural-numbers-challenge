package yazabara.service.ranges.impl;

import org.junit.jupiter.api.Test;
import yazabara.data.Range;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SimpleAlgorithmTest {

    @Test
    void process1() {
        SimpleAlgorithm algorithm = new SimpleAlgorithm();
        HashSet<Integer> data = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(5);
            add(4);
            add(6);
        }};
        Range process = algorithm.process(data);
        assertNotNull(process);
        assertEquals(process.getFrom(), 1);
        assertEquals(process.getTo(), 6);
        assertEquals(process.getSize(), 6);
    }

    @Test
    void process2() {
        SimpleAlgorithm algorithm = new SimpleAlgorithm();
        HashSet<Integer> data = new HashSet<Integer>() {{
            add(6);
            add(4);
            add(3);
            add(5);
            add(7);
            add(10);
            add(16);
            add(19);
            add(20);
            add(17);
            add(18);
            add(15);
        }};
        Range process = algorithm.process(data);

        assertNotNull(process);
        assertEquals(process.getFrom(), 15);
        assertEquals(process.getTo(), 20);
        assertEquals(process.getSize(), 6);
    }
}
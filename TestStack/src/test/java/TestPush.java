import org.junit.Test;

import static org.junit.Assert.*;

public class TestPush {
    @Test
    public void push() throws Exception {

        Stack stack = new Stack(5);

//        stack.push(5);
//        stack.push(3);
//        stack.push(7);
//        stack.push(4);
//        stack.push(2);
//        stack.push(9);
//        stack.push(11);

        int actual = stack.push(5);
        int expected = 5;
        assertEquals(expected, actual);

        int actual2 = stack.push(3);
        int expected2 = 3;
        assertEquals(expected2, actual2);

        int actual3 = stack.push(7);
        int expected3 = 7;
        assertEquals(expected3, actual3);

        int actual4 = stack.push(4);
        int expected4 = 4;
        assertEquals(expected4, actual4);

        int actual5 = stack.push(2);
        int expected5 = 2;
        assertEquals(expected5, actual5);

        int actual6 = stack.push(9);
        int expected6 = 9;
        assertEquals(expected6, actual6);

        int actual7 = stack.push(11);
        int expected7 = 11;
        assertEquals(expected7, actual7);
        }
    }
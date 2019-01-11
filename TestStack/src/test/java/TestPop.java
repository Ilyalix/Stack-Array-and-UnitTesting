import org.junit.Test;

import static org.junit.Assert.*;

public class TestPop {
    @Test
    public void pop() throws Exception {

        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(11);

        int actual = stack.pop();
        int expected = 9;
        assertEquals(expected, actual);
    }
}
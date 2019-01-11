import org.junit.Test;

import static org.junit.Assert.*;

public class TestEmpty {
    @Test
    public void isEmpty() throws Exception {

        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(11);

        boolean actual = stack.isEmpty();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryNodeTest {
    @Test
    public void test_Binarynode() {
        BinaryNode classUnderTest = new BinaryNode(39);
        assertEquals(null, classUnderTest.left);
        assertEquals(null, classUnderTest.right);
        assertEquals(39, classUnderTest.key);

    }
}
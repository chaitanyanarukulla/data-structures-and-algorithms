package Tree;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    public BinaryTree<Integer> test;
    @Before
    public void setTree() {
        this.test = new BinaryTree();
        BinaryNode<Integer> root = new BinaryNode<>(1);
        BinaryNode<Integer> l = new BinaryNode<>(2);
        BinaryNode<Integer> r = new BinaryNode<>(3);
        BinaryNode<Integer> ll = new BinaryNode<>(4);
        BinaryNode<Integer> lr= new BinaryNode<>(5);
        BinaryNode<Integer> rl = new BinaryNode<>(6);
        BinaryNode<Integer> rr = new BinaryNode<>(7);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        r.setRight(rr);
        this.test.setRoot(root);

    }



    @Test
    public void Test_inorder() {
     assertEquals(
             new ArrayList<>(Arrays.asList(4,2,5,1,6,3,7)),this.test.inorder());
    }


    @Test
    public void test_preOrder() {
        assertEquals(
                new ArrayList<>(Arrays.asList(1,2,4,5,3,6,7)),this.test.preOrder());
    }

    @Test
    public void test_postOrder() {
        assertEquals(
                new ArrayList<>(Arrays.asList(4,5,2,6,7,3,1)),this.test.postOrder());
    }
}
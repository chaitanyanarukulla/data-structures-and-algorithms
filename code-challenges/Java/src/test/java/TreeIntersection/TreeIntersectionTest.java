package TreeIntersection;

import static org.junit.Assert.*;
import Tree.BinaryNode;
import Tree.BinaryTree;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeIntersectionTest {

    public BinaryTree<Integer> TreeOne;
    public BinaryTree<Integer> TreeTwo;

    @Before
    public void initializingTheTrees() {
        this.TreeOne = new BinaryTree<>();
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
            this.TreeOne.setRoot(root);

        this.TreeTwo = new BinaryTree<>();
            BinaryNode<Integer> rootB = new BinaryNode<>(6);
            BinaryNode<Integer> lB = new BinaryNode<>(7);
            BinaryNode<Integer> rB = new BinaryNode<>(3);
            BinaryNode<Integer> llB = new BinaryNode<>(9);
            BinaryNode<Integer> lrB = new BinaryNode<>(14);
            BinaryNode<Integer> rlB = new BinaryNode<>(62);
            BinaryNode<Integer> rrB = new BinaryNode<>(79);
            root.setLeft(lB);
            l.setLeft(llB);
            l.setRight(lrB);
            root.setRight(rB);
            r.setLeft(rlB);
            r.setRight(rrB);
            this.TreeTwo.setRoot(rootB);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIllegal_Argument_Exception(){
        BinaryTree<Integer> TreeThree = new BinaryTree<>();
        TreeIntersection.tree_intersection(TreeThree, TreeTwo);
    }

    @Test
    public void testThe_Tree_Intersection() {
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 99, 56, 634));
        assertEquals(expectedOutput, TreeIntersection.tree_intersection(TreeOne, TreeTwo));
    }
    }

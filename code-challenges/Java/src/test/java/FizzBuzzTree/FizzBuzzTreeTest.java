package FizzBuzzTree;

import Tree.BinaryNode;
import Tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

    public BinaryTree<Integer> testing;


    @Test
    public void test_FizzBuzz() {
        BinaryNode<Integer> root = new BinaryNode<>(30);
        BinaryNode<Integer> l = new BinaryNode<>(100);
        BinaryNode<Integer> r = new BinaryNode<>(9);
        BinaryNode<Integer> ll = new BinaryNode<>(4);
        BinaryNode<Integer> lr = new BinaryNode<>(50);
        BinaryNode<Integer> rl = new BinaryNode<>(6);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        testing = new BinaryTree<>();
        testing.setRoot(root);
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree(testing);
        assertEquals(new ArrayList<>(Arrays.asList(4, "Buzz", "Buzz", "FizzBuzz", "Fizz", "Fizz")), testing.inorder());
    }

    @Test
    public void test_FizzBuzz_neg() {
        BinaryNode<Integer> root = new BinaryNode<>(-30);
        BinaryNode<Integer> l = new BinaryNode<>(-100);
        BinaryNode<Integer> r = new BinaryNode<>(-9);
        BinaryNode<Integer> ll = new BinaryNode<>(-4);
        BinaryNode<Integer> lr = new BinaryNode<>(-50);
        BinaryNode<Integer> rl = new BinaryNode<>(-6);
        root.setLeft(l);
        l.setLeft(ll);
        l.setRight(lr);
        root.setRight(r);
        r.setLeft(rl);
        testing = new BinaryTree<>();
        testing.setRoot(root);
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree(testing);
        assertEquals(new ArrayList<>(Arrays.asList(-4, "Buzz", "Buzz", "FizzBuzz", "Fizz", "Fizz")), testing.inorder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty(){
        this.testing = new BinaryTree<>();
        FizzBuzzTree fizzTree = new FizzBuzzTree();
        fizzTree.fizzBuzzTree((testing));
    }

}
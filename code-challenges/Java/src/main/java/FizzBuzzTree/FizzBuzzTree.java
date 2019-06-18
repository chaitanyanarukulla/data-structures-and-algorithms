package FizzBuzzTree;


import Tree.BinaryTree;
import Tree.BinaryNode;

// Fizzbuzz class
public class FizzBuzzTree<T> {

    BinaryNode<T> root;

    public BinaryTree fizzBuzzTree(BinaryTree input){
        if (input.getRoot() == null){
            throw new IllegalArgumentException("not working");
        }
        if (input.getRoot() != null) {
            fizzBuzzChecker(input.getRoot());
        }
        return input;
    }
// fizz buzz helper
    public BinaryNode<T> fizzBuzzChecker(BinaryNode node) {
        if (node == null) {
            return null;
        } else {
            changeFizz(node);
        }
        fizzBuzzChecker(node.getLeft());
        fizzBuzzChecker(node.getRight());
        return node;
    }
// method to change vals to fizz buzz
    public void changeFizz(BinaryNode node){
        if ((int)node.getKey() % 15 == 0) {
            node.setKey("FizzBuzz");
        } else if ((int)node.getKey() % 3 == 0) {
            node.setKey("Fizz");
        } else if ((int)node.getKey() % 5 == 0) {
            node.setKey("Buzz");
        }
    }

}


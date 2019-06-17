package Tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    public void add(T value) {
        // Do not add the new value if it already exists in the BST
        if (this.contains(value))
            return;

        BinaryNode<T> newTreeNode = new BinaryNode<>(value);
        BinaryNode<T> root = this.getRoot();

        if (root == null)
            // Add the new tree node if the BST is empty to begin with
            this.setRoot(newTreeNode);
        else
            // Execute the recursive addHelper method if the BST is not empty
            this.addHelper(root, newTreeNode);
    }

    private void addHelper(BinaryNode<T> treeNode, BinaryNode<T> newTreeNode) {

        // It is needed for comparing generics which is why the T type for the class signature extends Comparable<T>
        if (newTreeNode.getKey().compareTo(treeNode.getKey()) < 0) {
            if (treeNode.getLeft() == null)
                treeNode.setLeft(newTreeNode);
            else
                this.addHelper(treeNode.getLeft(), newTreeNode);
        } else {
            if (treeNode.getRight() == null)
                treeNode.setRight(newTreeNode);
            else
                this.addHelper(treeNode.getRight(), newTreeNode);
        }
    }

    public boolean contains(T value) {
        return this.containsHelper(this.getRoot(), value);
    }

    private boolean containsHelper(BinaryNode<T> treeNode, T value) {
        if (treeNode == null)
            return false;

        if (treeNode.getKey().equals(value))
            return true;

        return (value.compareTo(treeNode.getKey()) < 0) ?
                this.containsHelper(treeNode.getLeft(), value) :
                this.containsHelper(treeNode.getRight(), value);
    }
}

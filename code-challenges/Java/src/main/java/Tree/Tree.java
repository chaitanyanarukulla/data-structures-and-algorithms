package Tree;

import java.util.ArrayList;

public class Tree<T> {


    BinaryNode<T> root;


    Tree()
    {
        root = null;
    }
//Inorder
   public ArrayList<T> inorder()
    {
        ArrayList<T> arrli = new ArrayList<>();

        if (this.root != null) {
            helperInorder(this.root, arrli);
        }
        return arrli;
    }

    public void helperInorder(BinaryNode<T> node ,ArrayList<T> patato){
        if(node.left != null){
            helperInorder(node.left,patato);
        }

        patato.add(node.key);

        if(node.right != null){
            helperInorder(node.right,patato);
        }

    }

//Preorder
    public ArrayList<T> preOrder()
    {
        ArrayList<T> arrli = new ArrayList<>();

        if (this.root != null) {
            helperPreorder(this.root, arrli);
        }
        return arrli;
    }

    public void helperPreorder(BinaryNode<T> node ,ArrayList<T> patato){
        patato.add(node.key);
        if(node.left != null){
            helperInorder(node.left,patato);
        }
        if(node.right != null){
            helperInorder(node.right,patato);
        }

    }

    //Postorder
    public ArrayList<T> postOrder()
    {
        ArrayList<T> arrli = new ArrayList<>();

        if (this.root != null) {
            helperPostOorder(this.root, arrli);
        }
        return arrli;
    }

    public void helperPostOorder(BinaryNode<T> node ,ArrayList<T> patato){
        if(node.left != null){
            helperInorder(node.left,patato);
        }
        patato.add(node.key);
        if(node.right != null){
            helperInorder(node.right,patato);
        }
        patato.add(node.key);
    }
}

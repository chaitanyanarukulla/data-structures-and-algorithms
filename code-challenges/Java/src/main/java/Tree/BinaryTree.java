package Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
   public  BinaryNode<T> root;

    public BinaryTree()
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
            helperPreorder(node.left,patato);
        }
        if(node.right != null){
            helperPreorder(node.right,patato);
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
            helperPostOorder(node.left,patato);
        }
        if(node.right != null){
            helperPostOorder(node.right,patato);
        }
        patato.add(node.key);
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }


    public BinaryNode<T> getRoot() {
        return this.root;
    }

// breadth First
    static String breadthFirst(BinaryTree input) {
        if(input.getRoot() == null)
            return "null";

        Queue<BinaryNode> q =new LinkedList<>();
        String ans = "";
        q.add(input.getRoot());

        while(true) {
            int levelCount = q.size();
            if(levelCount == 0)
                break;
            while(levelCount > 0)
            {
                BinaryNode node = q.peek();
                System.out.print(node.key + " ");
                ans += node.key + "\n";
                q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                levelCount--;
            }
        }return ans;
    }

}

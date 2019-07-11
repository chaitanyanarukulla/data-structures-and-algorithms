package TreeIntersection;
import Tree.BinaryTree;
import java.util.ArrayList;
import java.util.HashSet;

public class TreeIntersection {
    public static ArrayList<Integer> tree_intersection(BinaryTree<Integer> treeOne, BinaryTree<Integer> treeTwo){
        if(treeOne.getRoot() == null || treeTwo.getRoot() == null){ throw new IllegalArgumentException("Empty Tree"); }
        HashSet<Integer> hashTreeOne = new HashSet<>();
        HashSet<Integer> hashTreeTwo = new HashSet<>();

        hashTreeOne.addAll(treeOne.preOrder());
        hashTreeTwo.addAll(treeTwo.preOrder());

        hashTreeOne.retainAll(hashTreeTwo);
        return new ArrayList<>(hashTreeOne);
    }

}


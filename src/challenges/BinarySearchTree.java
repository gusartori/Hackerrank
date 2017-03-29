package challenges;

/**
 * Created by Gustavo on 27/03/17.
 */
public class BinarySearchTree {

    boolean checkBST(Node root) {
        return recursiveCheck(root, -1, 10001);
    }

    boolean recursiveCheck(Node root, int min, int max){

        if(root == null)
            return true;

        if(root.data <= min || root.data >= max)
            return false;

        return(recursiveCheck(root.left, min, root.data) && recursiveCheck(root.right, root.data, max));


    }
}

class Node {
    int data;
    Node left;
    Node right;
}

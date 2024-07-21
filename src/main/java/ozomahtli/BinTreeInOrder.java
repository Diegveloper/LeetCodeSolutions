package ozomahtli;

import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinTreeInOrder {




        public List<Integer> inorderTraversal(TreeNode root) {
            ArrayList<Integer> ar = new ArrayList<>();
            inOrder(root, ar);
            return ar;

        }

        public void inOrder(TreeNode root, ArrayList a){
            if( root != null){
                inOrder(root.left, a);
                a.add(root.val);
                inOrder(root.right, a);
            }
        }

}

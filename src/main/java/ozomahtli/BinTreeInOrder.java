package ozomahtli;

import java.util.ArrayList;
import java.util.List;

public class BinTreeInOrder {


      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
      }



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

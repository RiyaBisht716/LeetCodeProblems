/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        //base case to stop recursion

        if(root == null) return true;

        return isSymmetric(root.left, root.right);
        
    }
    public boolean isSymmetric(TreeNode rootLeft,TreeNode rootRight){
        if(rootLeft == null && rootRight == null) return true;

        else if(rootLeft == null || rootRight == null) return false;


        //symmetric or not
        if(rootLeft.val != rootRight.val) return false;

        if(!isSymmetric(rootLeft.left, rootRight.right)) return false;

        if(!isSymmetric(rootLeft.right, rootRight.left)) return false;

        //if symmetric
        return true; 
    }
}
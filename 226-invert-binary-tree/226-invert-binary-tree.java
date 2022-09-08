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
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        else
        {   //swapping values
            TreeNode node = root.left; 
            root.left = root.right;
            root.right = node;

            if(root.left!=null)
                invertTree(root.left); //recursion

            if(root.right!=null)
                invertTree(root.right);

            return root;
        }
    }
}
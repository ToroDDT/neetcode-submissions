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
 // what is the problem 
 // what are the two problems that i need to solve for determining if a tree is balanced
 // i need to know its height and the left and right subtrees are balanced
 // how should i store the the height and whether the subtress are balanced 
 // the use of of an array, 
 // the first index will store whether the subtrees are balanced
 // the second index will store the height 
 // what is the base situation 
 // the tree is empty, if the tree is empty, create an array storeing 1 and 0
 // the 1 symbolizeing the tree is balanced, zero as the height;

class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }
    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[] {1, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        boolean balanced = (left[0] == 1 && right[0] == 1) && (Math.abs(left[1] - right[1])<=1);
        int height = 1 + Math.max(left[1], right[1]);
        return new int[] {balanced ? 1 : 0, height};
    }
}

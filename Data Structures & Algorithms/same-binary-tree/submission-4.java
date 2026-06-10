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
    public boolean isSameTree(TreeNode p, TreeNode q) {
// Check 1: Both are null
if (p == null && q == null) {
    return true;
}

// Check 2: One is null, but not both (Structural mismatch)
if (p == null || q == null) {
    return false;
}

// Check 3: Neither is null, so check if values mismatch
if (p.val != q.val) {
    return false;
}
        
       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

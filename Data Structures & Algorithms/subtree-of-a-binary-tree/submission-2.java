class Solution {  
    // 1. SEARCH METHOD: Traverses the main tree to find a match
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base case: We reached the end of a branch and didn't find subRoot
        if (root == null) {
            return false;
        }

        // If the current node happens to match subRoot, verify the whole structure
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // If it doesn't match here, keep searching down the left OR right branches
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // 2. VERIFICATION METHOD: Checks if two trees are perfectly identical
    private boolean isSameTree(TreeNode p, TreeNode q) {
        // Both are null -> structural match
        if (p == null && q == null) {
            return true;
        }
        // One is null but not both -> structural mismatch
        if (p == null || q == null) {
            return false;
        }
        // Values don't match -> value mismatch
        if (p.val != q.val) {
            return false;
        }

        // If this node matches, check if their left and right children match perfectly too
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
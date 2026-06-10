class Solution {
    public boolean isBalanced(TreeNode root) {
        // If dfs returns -1, it means some subtree somewhere was unbalanced
        return dfs(root) != -1;
    }

    private int dfs(TreeNode root) {
        // Base case: An empty tree has a height of 0
        if (root == null) {
            return 0;
        }

        // 1. Get the height of the left subtree
        int leftHeight = dfs(root.left);
        // If the left subtree is already unbalanced, pass the error (-1) up
        if (leftHeight == -1) return -1;

        // 2. Get the height of the right subtree
        int rightHeight = dfs(root.right);
        // If the right subtree is already unbalanced, pass the error (-1) up
        if (rightHeight == -1) return -1;

        // 3. Check if the CURRENT node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is unbalanced!
        }

        // 4. If balanced, return the actual height of this node to its parent
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        ans = 0
        
        def dfs(node):
            nonlocal k, ans
            if not node:
                return
            
            # 1. Traverse left subtree
            dfs(node.left)
            
            # 2. Process current node
            k -= 1
            if k == 0:
                ans = node.val
                return
            
            # 3. Traverse right subtree
            dfs(node.right)
            
        dfs(root)
        return ans
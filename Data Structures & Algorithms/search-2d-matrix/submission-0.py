from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False
        
        low = 0
        high = len(matrix) - 1

        # Binary search over rows
        while low <= high:
            mid = low + (high - low) // 2
            row = matrix[mid]
            
            # If target could be in this row
            if row[0] <= target <= row[-1]:
                # Binary search inside this row
                return self.inner_search(row, target)
            elif row[0] > target:
                high = mid - 1
            else:  # row[-1] < target
                low = mid + 1

        return False

    def inner_search(self, row: List[int], target: int) -> bool:
        low = 0
        high = len(row) - 1
        
        while low <= high:
            mid = low + (high - low) // 2
            if row[mid] == target:
                return True
            elif row[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
                
        return False

# Example usage:
solution = Solution()
print(solution.searchMatrix([[1, 2, 4, 8], [10, 11, 12, 13], [14, 20, 30, 40]], 100))  # False
print(solution.searchMatrix([[1, 2, 4, 8], [10, 11, 12, 13], [14, 20, 30, 40]], 12))   # True

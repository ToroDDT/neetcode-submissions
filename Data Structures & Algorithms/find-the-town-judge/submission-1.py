class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        adj = {i: [] for i in range(1, n + 1)}
        suspects = []
        
        for key, val in trust:
            adj[key].append(val)
            
        # The town judge trusts nobody, so their list should be empty
        for key, value in adj.items():
            if not value:
                suspects.append(key)
                
        if len(suspects) != 1:
            return -1 
            
        judge = suspects[0]
        
        # Verify that everyone else (except the judge) trusts the judge
        for key, value in adj.items():
            if key != judge:
                if judge not in value:
                    return -1 
                    
        return judge
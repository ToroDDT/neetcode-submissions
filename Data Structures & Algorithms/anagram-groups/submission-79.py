class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(list)

        for s in strs:
            word = "".join(sorted(s))
            groups[word].append(s)
        return list(groups.values())
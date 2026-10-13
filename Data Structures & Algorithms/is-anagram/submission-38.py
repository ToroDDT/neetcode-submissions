class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        wordOne, wordTwo = "".join(sorted(s)), "".join(sorted(t))
        return wordOne == wordTwo
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        check = set()
        word = "".join(sorted(s))
        check.add(word)
        wordTwo = "".join(sorted(t))
        if wordTwo in check:
            return True
        return False

       
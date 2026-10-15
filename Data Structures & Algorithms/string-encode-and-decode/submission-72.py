class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded_words = []
        for s in strs:
            encoded_words.append(str(len(s)))
            encoded_words.append("#")
            encoded_words.append(s)
        return "".join(encoded_words)

    def decode(self, s: str) -> List[str]:
        i , j = 0, 0
        res = []
        while j < len(s):
            while s[j] != "#":
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = i + length
            res.append(s[i:j])
            i = j
        return res




class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        ct = 0
        for i in patterns:
            if i in word:
                ct+=1

        return ct

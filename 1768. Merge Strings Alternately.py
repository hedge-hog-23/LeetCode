class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ans = ""
        n1,n2 = len(word1),len(word2)
        i = 0
        while(i<n1 or i<n2):
            if(i<n1):
                ans+=word1[i]
            if(i<n2):
                ans+=word2[i]
            i+=1
        return ans

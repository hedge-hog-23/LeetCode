class Solution:
    def shortestPalindrome(self, s: str) -> str:
        if(s == s[::-1]):
            return s
        
        rev = s[::-1]
        for i in range(0,len(rev)):
            if s.startswith(rev[i:]):
                return rev[:i] + s



        

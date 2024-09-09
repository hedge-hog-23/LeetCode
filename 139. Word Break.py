class Solution:
    def wordBreak(self, s: str, dict: List[str]) -> bool:
        n = len(s)
        dp = [0] * (n+1)
        dp[0] = 1
        for i in range(1, n + 1):
            for j in range(i):
                if dp[j] and s[j:i] in dict:
                    dp[i] = 1
                    break
        return 1 if dp[n] else 0

class Solution:
    def losingPlayer(self, x: int, y: int) -> str:
        res = 0
        while x >= 1 and y >= 4:
            x -= 1
            y -= 4
            res += 1
        if res % 2 == 0:
            return "Bob"
        else:
            return "Alice"

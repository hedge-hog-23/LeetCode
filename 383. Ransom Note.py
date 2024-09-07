class Solution:
    def canConstruct(self, r: str, m: str) -> bool:
        char = {}
        #finding freq
        for i in m:
            if i in char:
                char[i]+=1
            else:
                char[i] = 1
        
        print(char)
        for i in r:
            if i in char and char[i]>0:
                char[i]-=1
            else:
                return False

        return True

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        sP:str = s.split()
        return len(sP[len(sP)-1])
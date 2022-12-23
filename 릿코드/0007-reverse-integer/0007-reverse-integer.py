class Solution:
    def reverse(self, x: int) -> int:
        y = 1
        if(x < 0):
            y = -1
            x *= -1
        if(int(str(x)[::-1]) > 2 ** 31):
            return 0
        return int(str(x)[::-1]) * y
        
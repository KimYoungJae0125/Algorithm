class Solution:
    def isHappy(self, n: int) -> bool:            
        while True:
            sum = 0
            while n > 0:
                sum += (n%10) ** 2
                n /= 10
                n = int(n)
            n = sum      
            if n < 10:
                break
        return n == 1 or n == 7
        
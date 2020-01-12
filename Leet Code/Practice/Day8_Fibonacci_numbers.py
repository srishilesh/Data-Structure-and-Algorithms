# https://leetcode.com/problems/fibonacci-number

# Various other solutions https://leetcode.com/problems/fibonacci-number/solution/


class Solution:
    def fib(self, N: int) -> int:
        if(N==0):
            return 0
        if(N==1):
            return 1
        a = 0
        b = 1
        sum = 0
        while(N>1):
            sum = a + b
            a = b
            b = sum
            N-=1
        return sum
#         memo = [-1]*(N+1)
#         return self.fibo(memo,N)
        
#     def fibo(self,memo,N):
#         if(N==0):
#             return 0
#         if(N==1):
#             return 1
#         if(memo[N]>0):
#             return memo[N]
#         memo[N] = self.fib(N-1) + self.fib(N-2)
#         return memo[N]
        
        

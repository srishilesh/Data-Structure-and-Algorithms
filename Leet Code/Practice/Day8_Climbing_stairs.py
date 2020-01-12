# https://leetcode.com/problems/climbing-stairs/

# Dynamic Programming with Top Down approach Memoization
class Solution:    
    def climbStairs(self,n: int) -> int:
        memo = [-1]*(n+1)
        return self.stairs(memo,n)
    
    def stairs(self,memo,n):
        f = 0
        if(n<0):
            return 0
        if(n==0):
            return 1
        if(memo[n]>0):
            return memo[n];
        memo[n] = self.stairs(memo,n-1) + self.stairs(memo,n-2)
        return memo[n]
        
# OTHER APPROACHES https://github.com/bephrem1/backtobackswe/blob/master/Dynamic%20Programming%2C%20Recursion%2C%20%26%20Backtracking/ClimbingStairs/ClimbingStairs.java


#         num = n
#         s = 0
#         while(num>1):
#             #if(num!=0 or (n-num)!=0):
#             s = s+(utils.factorial(n)//(utils.factorial(num)*utils.factorial(n-num)))
#             num = num - 1
#             print(s)
#         return s
# class utils:
#     def factorial(x):
#         f = 1
#         for i in range(1,x+1):
#             f = f*i
#         return int(f)

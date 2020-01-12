# https://leetcode.com/problems/reverse-intege

# MY SOLUTION

class Solution:
    def reverse(self, x: int) -> int:
        if(x<0):
            f = 1
        else:
            f = 0
        if((x)>(2**31-1) or x<(-2**31)):
            return 0
        z = str(abs(int(x)))
        z = z[::-1]
        if f==1:
            y = (-int(z))
        else:
            y = (int(z))
        if((y)>(2**31-1) or y<(-2**31)):
            return 0
        else:
            return y

#  SOLUTION IN JAVA

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

# If reverse == Integer.MAX_VALUE/10, then reverse = 2,147,483,640. We know that anything over 2,147,483,647 causes integer overflow, so pop cannot be greater than 7.
#Likewise, if reverse == Integer.MIN_VALUE/10, then reverse = -2,147,483,640. We know that anything under -2,147,483,648 causes integer underflow, so pop cannot be less than -8.

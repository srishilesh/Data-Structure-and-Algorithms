'''

Objective 
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1: 
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2: 
The binary representation of  is , so the maximum number of consecutive 's is .

'''

#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())
    s=""
    
    while(n>0):
        rem = n%2
        n= n/2
        #print(int(rem))
        s=s+str(int(rem))
        
        
    s=s.rstrip("0")
    string="".join(reversed(s))
    
    max = 0
    count = 0
    for i in range(len(string)):
        if(string[i]=="1"):
            count=count+1
        else:
            count=0
        
        if(max<count):
            max=count

    print(max)

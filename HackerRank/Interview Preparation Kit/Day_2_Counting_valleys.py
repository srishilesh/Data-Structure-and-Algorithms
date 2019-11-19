# https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countingValleys function below.
def countingValleys(n, s):
    count = 0
    sum = 0
    for i in range(n):
        #if(s[i:i+4]=="DUDU" or s[i:i+4]=="UDUD"):
        #    count+=1
        #else:
        #    count=count
        if(s[i]=='U'):
            sum+=1
        else:
            sum-=1
        #print(sum)
        if(sum==0 and s[i]=='U'):
            count+=1
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()

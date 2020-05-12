// https://www.hackerrank.com/challenges/chocolate-feast/problem

// My approach

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the chocolateFeast function below.
def chocolateFeast(n, c, m):
    wrapper = n//c
    bars = n//c
    result = bars
    #print(5//2)
    while(wrapper!=0):
        bars = (wrapper//m)
        #print(bars)
        if(wrapper%m!=0):
            wrapper = wrapper%m + bars
        else:
            wrapper = wrapper%m
        result+=bars
        if(wrapper<m):
            return result
        print(bars,wrapper,result)
    return result
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        ncm = input().split()

        n = int(ncm[0])

        c = int(ncm[1])

        m = int(ncm[2])

        result = chocolateFeast(n, c, m)

        fptr.write(str(result) + '\n')

    fptr.close()


// My solution


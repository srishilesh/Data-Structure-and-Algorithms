// https://www.hackerrank.com/challenges/closest-numbers/problem

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the closestNumbers function below.
def closestNumbers(arr):
    arr.sort()
    mini = 999999
    for i in range(1,len(arr)):
        if(mini>abs(arr[i]-arr[i-1])):
            mini = abs(arr[i]-arr[i-1])
    result = []
    for i in range(1,len(arr)):
        if(mini==abs(arr[i]-arr[i-1])):
            result.append(arr[i-1])
            result.append(arr[i])
    return result
            
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = closestNumbers(arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

// https://www.hackerrank.com/challenges/grid-challenge/problem

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the gridChallenge function below.
def gridChallenge(grid):
    result = []
    for i in grid:
        result.append(sorted(i))
    for k in range(0,len(result[0])):
        for i in range(0,len(result)-1):
            if(result[i][k]>result[i+1][k]):
                return "NO"
    return "YES"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        grid = []

        for _ in range(n):
            grid_item = input()
            grid.append(grid_item)

        result = gridChallenge(grid)

        fptr.write(result + '\n')

    fptr.close()


// SOLUTION

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the gridChallenge function below.
def gridChallenge(grid):
    temp=[0]*len(grid)
    for i in range(len(grid)):
        temp[i]=[grid[i][x] for x in range(len(grid[i]))]
    for i in range(len(temp)):
        temp[i].sort()
    for j in range(len(temp[0])):
        for i in range(1,len(temp)):
            if temp[i-1][j]>temp[i][j]:
                return 'NO'
    return 'YES'
            
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        n = int(input())

        grid = []

        for _ in range(n):
            grid_item = input()
            grid.append(grid_item)

        result = gridChallenge(grid)

        fptr.write(result + '\n')

    fptr.close()

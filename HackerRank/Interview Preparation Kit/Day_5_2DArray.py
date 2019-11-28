# https://www.hackerrank.com/challenges/2d-array/problem

#!/bin/python3

import math
import os
import random
import re
import sys

def Matmul(X):
    # result is 3x4
    cp = [1,1,1,0,1,0,1,1,1]
    result = [[0,0,0],
            [0,0,0],
            [0,0,0]]
    s = 0
    for i in range(9):
        s += X[i] * cp[i]
    #print(result)
    return s
# Complete the hourglassSum function below.
def hourglassSum(arr):
    
    fina = []
    for i in range(len(arr)-2):
        sum = 0
        temp = []
        for j in range(len(arr)-2):
            a = i
            b = j
            fi = []
            s = []
            while(a<i+3):
                b = j
                while(b<j+3):
                    fi.append(arr[a][b])
                    b+=1
                #s.append(fi)
                a+=1
            #print(fi)
            temp.append(Matmul(fi))
        fina.append(temp)

    return max(map(max, fina))
        




if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()

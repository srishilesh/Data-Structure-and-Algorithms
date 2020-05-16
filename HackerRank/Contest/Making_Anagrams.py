#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the makingAnagrams function below.
def makingAnagrams(s1, s2):
    map1 = {}
    map2 = {}
    tot = list(set(s1+s2))
    for i in s1:
        if i not in map1:
            map1[i] = 1
        else:
            map1[i]+=1
    for i in s2:
        if i not in map2:
            map2[i] = 1
        else:
            map2[i]+=1
    count = 0
    #result = []
    for i in map1:
        if i in map2:
            #print(map1[i],map2[i])
            count+=min(map1[i],map2[i])
    for i in map2:
        if i in map1:
            print(i)
            count+=min(map1[i],map2[i])
    
    return len(s1)+len(s2)-count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s1 = input()

    s2 = input()

    result = makingAnagrams(s1, s2)

    fptr.write(str(result) + '\n')

    fptr.close()

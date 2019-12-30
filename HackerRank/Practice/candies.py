# https://www.hackerrank.com/challenges/candies/problem

'''
Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies.

Function Description

Complete the candies function in the editor below. It must return the minimum number of candies Alice must buy.

candies has the following parameter(s):

n: an integer, the number of children in the class
arr: an array of integers representing the ratings of each student
Input Format

The first line contains an integer, , the size of .
Each of the next  lines contains an integer  indicating the rating of the student at position .

Constraints

Output Format

Output a single line containing the minimum number of candies Alice must buy.

Sample Input 0

3
1
2
2
Sample Output 0

4
Explanation 0

Here 1, 2, 2 is the rating. Note that when two children have equal rating, they are allowed to have different number of candies. Hence optimal distribution will be 1, 2, 1.

Sample Input 1

10
2
4
2
6
1
7
8
9
2
1
Sample Output 1

19
Explanation 1

Optimal distribution will be 

Sample Input 2

8
2
4
3
5
2
6
4
5
Sample Output 2

12
Explanation 2

Optimal distribution will be .

'''

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the candies function below.
def candies(n, arr):
    arr = [10**9] + arr + [10**9]
    fin = [0]*(n+1)
    for i in range(1,n+1):
        if arr[i-1]>=arr[i]<=arr[i+1]:
            fin[i] = 1
    for i in range(1,n+1):
        if arr[i-1]<arr[i]<=arr[i+1]:
            fin[i] = fin[i-1]+1
    for i in range(n,0,-1):
        if arr[i-1]>=arr[i]>arr[i+1]:
            fin[i] = fin[i+1]+1
    for i in range(1,n+1):
        if arr[i-1]<arr[i]>arr[i+1]:
            fin[i] = max(fin[i-1],fin[i+1])+1
    print(sum(fin))
    return sum(fin)
    
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = []

    for _ in range(n):
        arr_item = int(input())
        arr.append(arr_item)

    result = candies(n, arr)

    fptr.write(str(result) + '\n')

    fptr.close()





'''
This problem can be solved with a greedy technique.

We denote by  the number of candies given to the  child.

Let's classify the children into four kinds, depending on the comparisons of their ratings with their neighbors.

If , we say Child  is a valley.
If , we say Child  is a rise.
If , we say Child  is a fall.
If , we say Child  is a peak.
For the leftmost and rightmost child, assume they each have a neighbor with an infinite rating, so they can also be classified according to this scheme. (In particular, the leftmost child cannot be a rise or a peak, and the rightmost child cannot be a fall or a peak.)

Given this classification, we can intuitively distribute the candies this way:

For each valley child, give him/her  candy.
For each rise child, give him/her  candies.
For each fall child, give him/her  candies.
For each peak child, give him/her  candies.
Observe that this gives a valid distribution of candies. But does it give the minimum total number of candies?

Amazingly, it does! But only as long as you distribute the candies in the right order. Here's one good order:

Distribute the candies to the valleys.
Distribute the candies to the rises from left to right.
Distribute the candies to the falls from right to left.
Distribute the candies to the peaks.
Note that the order in which we distribute candies to rises and falls is pretty important!

Here's a Python implementation:

INF = 10**9 # a number larger than all ratings
n = input()
a = [input() for i in xrange(n)]

# add sentinels
a = [INF] + a + [INF]

candies = [0]*(n+1)
# populate 'valleys'
for i in xrange(1,n+1):
    if a[i-1] >= a[i] <= a[i+1]:
        candies[i] = 1

# populate 'rises'
for i in xrange(1,n+1):
    if a[i-1] < a[i] <= a[i+1]:
        candies[i] = candies[i-1] + 1

# populate 'falls'
for i in xrange(n,0,-1):
    if a[i-1] >= a[i] > a[i+1]:
        candies[i] = candies[i+1] + 1

# populate 'peaks'
for i in xrange(1,n+1):
    if a[i-1] < a[i] > a[i+1]:
        candies[i] = max(candies[i-1], candies[i+1]) + 1

# print the total number of candies
print sum(candies)
Of course, we need to prove why this assignment works. We will prove two things:

It gives a valid distribution of candies.
It gives a the distribution with the minimum sum.
Is it valid?
The first thing to notice is that: All children are assigned a positive number of candies. We just have to show that for every two neighbors with different ratings, the one with the higher rating is given more candies.

Consider two neighboring children  and  with different ratings. There are two cases:

Case 1: .

In this case, the only possible cases are:

Child  is a valley and Child  is a peak.
Child  is a valley and Child  is a rise.
Child  is a rise and Child  is a peak.
Child  is a rise and Child  is a rise.
In the first three cases, we can see that Child  is given candies earlier than Child  (due to the order we're giving out candies), and indeed, we see that . But actually, the same holds as well in the last case, since we're giving candies to rises from left to right.

Case 2: .

This is similar. In this case, the only possible cases are:

Child  is a peak and Child  is a valley.
Child  is a fall and Child  is a valley.
Child  is a peak and Child  is a fall.
Child  is a fall and Child  is a fall.
In the first three cases, we can see that Child  is given candies earlier than Child , and indeed, we see that . But actually, the same holds as well in the last case, since we're giving candies to falls from right to left.


This shows that the candy distribution is valid for every pair of neighbors, hence the overall distribution is valid as well!

Is it the minimum?
Proving that this gives the minimum total candies is a little easier. We just have to notice that these inequalities hold:

For each valley child , .
For each rise child , .
For each fall child , .
For each peak child , .
This easily follows from the constraints of the problem. Since the algorithm above satisfies each inequality in the tightest possible way, this means the overall number of candies is minimized.

The time complexity is , which is optimal.


Note that there are many other solutions as well, some requiring more advanced techniques, and some requiring even fewer passes through the array. This editorial just describes one.

'''

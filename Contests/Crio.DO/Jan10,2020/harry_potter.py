Harry Potter and his friends were standing in front of the Chamber of Secrets and they want to open it to know about the mystery. The chamber of secrets contains a lock which is a NxN grid containing integers from 1 to N^2.

Harry suddenly realized that he forgot his magic wand at his room, so now he has to unlock the lock manually using valid moves.

The valid moves are -

1. Rotate a row horizontally right or left in a circular manner.
2. Rotate a column vertically up or down in a circular manner.
The lock will open only if the grid is in the configuration of a magic square. A NxN magic square is a square that has the same sum of rows, columns and diagonals and contains each integer from 1 to N^2 exactly once.

A single valid move takes 1 sec time. You are given the initial configuration of the grid, can you write a program that can find for each test case the minimum time to unlock the lock.

If the lock can not be unlocked then print "-1".

Input Format

The first line contains an integer K denoting the number of test cases.

For each test case -

1.The first line contains an integer N.

2.In the next N lines, each line contains N space-separated integers representing
the configuration of the grid.
Constraints

1 <= T <= 3

1 <= N <= 3

1 <= grid[i][j] <= N^2

Each element of the grid is unique.

Output Format

For each test case -

A single line representing the minimum number of moves.
Sample Input 0

1
3
2 7 1
9 5 8
4 3 6
Sample Output 0

1
Explanation 0

In one move last column can be rotated vertically down to obtain a magic square.

def checkMagic(arr,n):
    sumRows = []
    sumCols = []
    sumDiag = 0
    for i in range(n):
        sumRows.append(sum(arr[i][0:n]))
    for i in range(n):
        sumCols.append(sum(arr[0:n][i]))
    for i in range(n):
        sumDiag+=int(arr[i][i])
    avgRows = sum(sumRows)//n
    avgCols = sum(sumCols)//n
    #print(avgRows," ",avgCols," ",sumDiag)
    if(avgRows==avgCols and avgRows==sumDiag):
        return True
    else:
        return False
def reqSum(n):
    return (n*(n**2+1))//2

def genMagic(arr,n):
    sumRows = []
    sumCols = []
    p = n*2
    q = reqSum(n)
    s = 0
    for i in range(n):
        sumRows.append(sum(arr[i][0:n]))
    for i in range(n):
        s = 0
        for j in range(n):
            s+=arr[j][i]
            
        sumCols.append(s)
    avgRows = sum(sumRows)//n
    avgCols = sum(sumCols)//n
    print(q," ",sumRows," ",sumCols) 
    f = -1
    if(avgRows!=q):
        f = 0
        for i in range(n):
            sumRows[i] = q - sumRows[i]
    else:
        f=-1
    if(avgCols!=q):
        f = 1
        for i in range(n):
            sumCols[i] = q-sumCols[i]
    else:
        f = -1 
    print(q," ",sumRows," ",sumCols)            
    changes = 0
    # if(f==1):
    for i in range(n):
        for j in range(n):
            tmp = (arr[i][j]+sumRows[i])
            if(tmp<=p or (tmp not in arr[i][0:n])):
                arr[i][j] = tmp
                changes+=1
                break
    changes = changes//n
    print(arr)
    for i in range(n):
        for j in range(n):
            tmp = (arr[j][i]+sumCols[i])
            if(tmp<=p or (tmp not in arr[0:n][i])):
                arr[j][i] = tmp
                changes+=1
                break
    changes = changes//n
    #elif(f==0):
    
    # else:
    #     changes = -1
    print(arr)
    if(changes==0):
        changes=-1
    return (changes)
            
            
        
    
if __name__=='__main__':
    T = int(input())
    for t in range(T):
        n = int(input())
        x = []
        for i in range(n):
            tmp = list(map(int,input().split()))
            x.append(tmp)
        print(genMagic(x,n))
        
    
    
             

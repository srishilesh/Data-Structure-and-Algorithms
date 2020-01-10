T = int(input())
for t in range(T):
    n = int(input())
    A = list(map(int , input().strip().split()))
    B = list(map(int , input().strip().split()))
    # Enter your code here. Read input from STDIN. Print output to STDOUTif
    temp = []
    A.sort()
    for i in range(n):
        j = 0
        while(j<(len(A))):
            if(A[j]-B[i]>0):
                temp.append(1)
                A.pop(j)
                break
            j+=1
        #print(A)
                   
    print(sum(temp))
            
            

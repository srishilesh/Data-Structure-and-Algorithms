// https://www.codechef.com/LTIME82B/problems/MXMLCM

// My approach
def gcd(a,b):
    if a == 0: 
        return b 
    return gcd(b % a, a) 
  
def lcm(a,b): 
    return (a*b)/gcd(a,b) 

def main():
    t = int(input())
    while(t>0):
        n,m = map(int,input().split())
        a = list(map(int,input().split()))
        s = ""
        for i in a:
            s+=str(i)
        x = [str(i) for i in range(1,m+1)]
        num = []
        for i in x:
            num.append(int(s+i))
        print(num)
        maxi = 0
        maxindex = 0
        for i in range(len(num)):
            lc = lcm(int(s),num[i])
            print(lc)
            if(maxi<lc):
                maxi = lc
                maxindex = i
        print(x[maxindex])
            
        t-=1
    
        


if __name__=='__main__':
    main()
    
// Solution

from sys import stdin,stdout
from math import gcd
t=int(stdin.readline())
while t>0:
    n,m=map(int,stdin.readline().split())
    l=list(map(int,stdin.readline().split()))
    ans=l[0]
    for i in range(1,n):
        ans=(ans*l[i])//gcd(ans,l[i])
    max_lcm=ans
    value=1
    for i in range(1,m+1):
        temp=(ans*i)//gcd(ans,i)
        if(temp>max_lcm):
            max_lcm=temp
            value=i
    stdout.write(str(value)+'\n')
    t-=1


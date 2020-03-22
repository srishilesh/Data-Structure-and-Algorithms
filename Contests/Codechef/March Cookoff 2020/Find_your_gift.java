from itertools import groupby  
def left(m,n):
    return m-1,n

def up(m,n):
    return m,n+1

def right(m,n):
    return m+1,n

def down(m,n):
    return m,n-1

def position(x,y,a,b):
    s = list(y)
    s = [i[0] for i in groupby(s)] 
    axis = list()
    for i in s:
        if i=='L' or i=='R':
            axis.append(0)
        else:
            axis.append(1)
    #print(s)
    m = a
    n = b
    i = 0
    p = -1
    while(i<(len(s))):
        if (s[i]=='L' and axis[i]!=p):
            m,n = left(m,n)
            p = 0
        elif (s[i]=='R' and axis[i]!=p):
            m,n = right(m,n)
            p = 0
        elif (s[i]=='U' and axis[i]!=p):
            m,n = up(m,n)
            p = 1
        elif (s[i]=='D' and axis[i]!=p):
            m,n=down(m,n)
            p = 1
        i+=1
    return m,n

def main():
    n = int(input())
    t = n
    a = 0
    b = 0
    while(t>0):
        x = int(input())
        y = input()
        m,n = position(x,y,0,0)
        print(m,n)
        t-=1



if __name__=='__main__':
    main()

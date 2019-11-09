import itertools

def subset(x,y):
    if(any(x1 in y for x1 in x)):
        return True
    else:
        return False

# def pandc(x,y):
#     c = 0
#     for i in y:
#         for j in x:
#             if(subset(j,i)==False):
#                 #print(i,' ',j)
#                 c = c+1
#     #print(c)
#     return c
    
# def pandc1(x,r):
#     yfin = [[]]
#     for i in range(0,len(x)-2):
#         y = []
#         #print(x[i])
#         if((subset(x[i],x[i+1])==False)and(subset(x[i+1],x[i+2])==False)and(subset(x[i],x[i+2])==False)):
#             y.append(x[i])
#             y.append(x[i+1])
#             y.append(x[i+2])
#         yfin.append(y)
#     print(yfin)

def pandc(x,r):
    c = 0
    z = [[]]
    for i in range(len(x)):
        t = []
        t.append(x[i])
        for j in range(i+1,len(x)):
            
            if(subset(x[j],t)==False):
                #print(x[j])
                t.append(x[j])
        z.append(t)
    print(z)

    return c

def gcd(m,n):
    if(n==0):
        return m
    else:
        return gcd(n,m%n)

def main():
    r,n = (input().split(" "))
    r = int(r)
    n = int(n)
    x = []
    for i in range(1,n+1):
        x.append(i)
    # print(x)
    flag = 0
    if(n%r==0):
        flag = 1
    y = [[]]
    for i in range(len(x)+1):
        for j in itertools.combinations(x, i):
            m = list(j)
            if((len(m)==int(n/r) or len(m)==(int(n/r)+1))and flag==0):
                y.append(m)
            if(len(m)==(n/r) and flag==1):
                y.append(m)
            #y.append(m)
    y.remove([])
    # if(flag==0):
    #     #print(pandc(y2,y3))
    #     pass
    # else:
    #     print(pandc1(y,r))
    #print(pandc(y,r))
    print(y)

if __name__=='__main__':
    main()

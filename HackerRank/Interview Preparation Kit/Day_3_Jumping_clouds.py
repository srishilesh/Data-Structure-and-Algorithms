# https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
x = input()
li = x.split(" ")
a = set()
c = 0
#print(li)
i=0
f=0
if(li[-2]=='1'):
    f=1

while(i<(len(li)-2)):
    m = i+1
    n = i+2
    
    if(li[m]=='0'):
        if(li[n]=='0'):
            i=n
        else:
            i=m
        a.add(i)
    else:
        if(li[m]=='1'):
            i=m+1
        if(li[n]=='1'):
            i=n+1
        a.add(i)
    
    #print(m," ",n," ",i)

print(a)    
if(f==1):
    print(len(a))    
else:
    print(len(a)+1)
#print(a)
#print(len(a))
# for i in range(1,len(a)-2):
#     #print(type(a[i]-a[i-1])," ",a[i+1]-a[i]," ",a[i+1])
#     #print(a[i])
#     if(((a[i]-a[i-1])==1)and ((a[i+1]-a[i])==1)):
#         a.pop(i)

# #print(a)
# print(len(a)-1)        




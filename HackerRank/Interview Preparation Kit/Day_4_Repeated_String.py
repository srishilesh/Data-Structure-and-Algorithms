# https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

# Enter your code here. Read input from STDIN. Print output to STDOUT
x = input()
n = int(input())

a = n%len(x)
b = int(n/len(x))
c = 0
d=0
for i in x:
    if(i=='a'):
        c+=1
for i in x[0:a]:
    if(i=='a'):
        d+=1

if(len(x)==1 and x=='a'):
    print(n)
else:
    print((c*b)+d)

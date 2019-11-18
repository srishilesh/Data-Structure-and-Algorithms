# https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
x = (input())
li = x.split(" ")
count = 0
for i in set(li):
    a = li.count(i)
    count+=int(a/2)
print(int(count))


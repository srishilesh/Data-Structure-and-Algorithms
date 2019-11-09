n = int(input())
ch = []
for i in range(0,n):
    #for j in range(i,n):
    m = input().split(" ")
    ch.append(m)

x = []
j = 0
for i in ch:   
    if 'X' in i:
        v = []
        v.append(j)
        v.append(i.index('X'))
        x.append(v)
    j= j+1

# print(x)
for i in x:
    



# O I M U R
# J V U X A
# X W T S R
# K Z F H D
# Q W K V M

def reverse(t,start,end):
    while(start<end):
        temp = t[start]
        t[start] = t[end]
        t[end] = temp
        start+=1
        end-=1
    
def combinations(s):
    s = list(s)
    length = len(s)
    if(max(s) not in s[0:length//2]):
        count=1
    else:
        count = 0
    for i in range(1,length):
        t = s.copy()
        reverse(t,0,length-1)
        reverse(t,0,i-1)
        reverse(t,i,length-1)
        first = t[0:length//2]
        if(max(t) not in first):
            count+=1
    return count

def main():
    n = int(input())
    while(n>0):
        x = int(input())
        y = (map(int,input().split()))
        print(combinations(y))
        n-=1


if __name__=='__main__':
    main()

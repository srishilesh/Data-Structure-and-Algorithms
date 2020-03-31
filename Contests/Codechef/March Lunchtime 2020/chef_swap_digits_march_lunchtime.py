// My approach

def main():
    t = int(input())
    while(t>0):
        a,b = map(int,input().split())
        if(a<99 and b<99):
            t = a+b
            a = list(map(int,str(a)))
            b = list(map(int,str(b)))
            lena = len(a)
            lenb = len(b)
            length = lena+lenb
            num = a+b
            x = []
            y = []
            while(len(num)>0):
                m = max(num)
                if(len(x)!=max(lena,lenb)):
                    x.append(m)
                else:
                    y.append(m)
                maxindex = num.index(m)
                num.pop(maxindex)
                length-=1
            s = [str(i) for i in x] 
            x = int("".join(s)) 
            s = [str(i) for i in y]    
            y = int("".join(s)) 
            s1 = x+y
            if(t>s1):
                print(t)
            else:
                print(s1)
        t-=1

if __name__ == '__main__':
    main()
    
    
// Solution

// https://discuss.codechef.com/t/swpdgt-editorial-unofficial/59434

for t in range(int(input().strip())):
   a, b = tuple(map(int, input().strip().split()))
   diff1 = 0 if b < 10 else (a % 10 - b // 10)
   diff2 = 0 if a < 10 else (b % 10 - a // 10)
   res = a + b + 9 * max(0, diff1, diff2)
   print(res)
   
   
   

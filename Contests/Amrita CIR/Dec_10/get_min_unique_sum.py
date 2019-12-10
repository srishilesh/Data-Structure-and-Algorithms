'''
def getuniqueminsum(arr):
    x = []
    l = len(arr)
    
    # for i in range(len(arr)):
    #     c = 0
    #     for j in range(i+1,len(arr)):
    #         if(arr[i]==arr[j]):
    #             c+=1
    #     if(c>=1):
    #         x.append(arr[i])
    #         arr.pop(i)
    
    dicti = {i:int(arr.count(i)) for i in arr}
    arr = list(set(arr))
    #print(dicti)
    x = []
    for i in arr:
        if(dicti[i]>1):
            x.append(i)
    k = 1          
    s = 0
    for j in x:
        #if(len(set(arr))!=l):
        k = 1
        while(len(set(arr))<l):
            t = j+k
            if(t not in arr):
                arr.append(t)
                s = sum(arr)
                #s=max(orisum,temp)
                
            k+=1
    print(arr)
    return s'''

def getuniqueminsum(arr):
    n = len(arr)
    sum = arr[0]
    prev = arr[0]
    for i in range(1,n):
        if(sum<=prev):
            prev+=1
            sum+=prev
        else:
            sum+=arr[i]
            prev=arr[i]
    return sum

def main():
    n = int(input())
    x = []
    for i in range(n):
        x.append(int(input()))
    a = getuniqueminsum(x)
    print(a)


if __name__=="__main__":
    main()

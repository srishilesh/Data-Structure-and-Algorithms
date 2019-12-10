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
    while(len(set(arr))<l):
        #if(len(set(arr))!=l):
        for j in x:
            t = j+k
            if(t not in arr):
                arr.append(t)
                s = sum(arr)
                #s=max(orisum,temp)
                
            k+=1
    #print(arr)
    return s

def main():
    n = int(input())
    x = []
    for i in range(n):
        x.append(int(input()))
    a = getuniqueminsum(x)
    print(a)


if __name__=="__main__":
    main()

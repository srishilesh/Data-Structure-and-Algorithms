def search(arr,pivot,key,n):
    l = pivot
    h = n-1
    while(l<=h):
        m = (l+h)//2
        if(arr[m]>key):
            h = m
        elif(arr[m]<key):
            l = m+1
        elif(arr[m]==key):
            print("Found at ",m)
            return
    print("Not found")
            

def main():
    size = int(input("Enter size: "))
    d = int(input("Enter value to search: "))
    arr = []
    y = 0
    for i in range(size):
        x = int(input())
        if(y>x):
            p = i
        arr.append(x)
        y = x
    print(p)
    search(arr,p,d,size)
    

if __name__=="__main__":
    main()

def rotateArray(arr,d,n):
    for i in range(d):
        temp = arr[0]
        for j in range(1,n):
            arr[j-1] = arr[j]
        arr[n-1] = temp
    print(arr)



def main():
    size = int(input("Enter size: "))
    d = int(input("Enter value of d: "))
    arr = []
    for i in range(size):
        x = int(input())
        arr.append(x)
    rotateArray(arr,d,size)
    

if __name__=="__main__":
    main()

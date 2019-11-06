# https://www.geeksforgeeks.org/array-rotation/

#   MY APPROACH

def rotate_array(arr,d,n):
    x = []
    m = 0
    for i in arr:
        if(m<d):
            x.append(arr[m])
            m = m + 1
    for i in range(0,len(arr)-1):
        if(i+d<n):
            temp = arr[i+d]
        arr[i] = temp
    for i in x:
        arr[n-d] = i
        d = d - 1

    return arr

def main():
    n = int(input("Enter the size: "))
    arr = []
    for i in range(n):
        x = int(input())
        arr.append(x)
    d = int(input("Search: "))
    y = rotate_array(arr,d,n)
    print(y)

if __name__ == '__main__':
    main()
    
    

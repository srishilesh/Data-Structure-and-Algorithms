# https://www.geeksforgeeks.org/array-rotation/

#   MY APPROACH
# Time: O(n)
# Space: O(d)
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


# APPROACH 1
# ROTATE LEFT BY ONE
# Time: O(n*d)
# Space: O(1)

def rotate_array(arr,d,n):
    for i in range(d):
        arr = left_rotate(arr,n)
    return arr

def left_rotate(arr,n):
    temp = arr[0]
    for i in range(n-1):
        arr[i] = arr[i+1]
    arr[n-1] = temp
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
    
    
# APPROACH 3
# ROTATING BLOCKS BY REVERSING

def block_swap(arr,d,n):
    a = arr[:d]
    b = arr[d:n]
    a.reverse()
    b.reverse()
    c = a+b
    c.reverse()
    print(c)

def reverseArray(arr,start,end):
    while(start<end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start+=1
        end-=1
    return arr

def rotateArray(arr,d,n):
    if d==0:
        return
    reverseArray(arr,0,d-1)
    reverseArray(arr,d,n-1)
    reverseArray(arr,0,n-1)


def main():
    size = int(input("Enter size: "))
    d = int(input("Enter value of d: "))
    arr = []
    for i in range(size):
        x = int(input())
        arr.append(x)
    #block_swap(arr,d,size)
    rotateArray(arr,d,size)
    print(arr)

if __name__=="__main__":
    main()
    

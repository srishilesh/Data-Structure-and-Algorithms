def main():
    n = int(input())
    q1 = []
    q2 = []
    q3 = []
    q1 = (input().split(" "))
    q2 = (input().split(" "))
    q3 = (input().split(" "))
    r = int(input())
    for i in range(r):
        ind = []
        ind = (input().split())
        l1 = int(ind[0])
        h1 = int(ind[1])
        l2 = int(ind[2])
        h2 = int(ind[3])
        l3 = int(ind[4])
        h3 = int(ind[5])

        a = q1[l1-1:h1]
        b = q2[l2-1:h2]
        c = q3[l3-1:h3] 
        # print(a)
        # print(b)
        # print(c)
        fin = len(set(a + b + c))
        print(fin)


if __name__=='__main__':
    main()


# 10
# 11 12 13 14 15 16 17 18 19 20
# 16 17 18 19 20 21 22 23 24 25
# 21 22 23 24 25 26 27 28 29 30
# 1
# 2 7 1 5 2 6


# 7
# 1 2 3 4 5 6 7
# 6 6 2 1 5 2 1
# 2 5 4 3 1 8 3
# 2
# 1 5 3 5 2 4
# 1 3 5 6 3 7

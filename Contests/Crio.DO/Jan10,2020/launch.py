if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        (ac1, ac2, ac3, sl, gn) =[int(x) for x in input().split()]
        #print(ac1, ac2, ac3, sl, gn)
        li = []
        a = ac1//1
        li.append(a)
        b = ac2//2
        li.append(b)
        c = ac3//3
        li.append(c)
        d = sl//6
        li.append(d)
        e = gn//10
        li.append(e)
        print(min(li))
        




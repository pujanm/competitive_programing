t = int(input())

for _ in range(t):

    inp = str(input()).split()
    n, k = int(inp[0]), int(inp[1])

    a = str(input()).split()
    for i in range(len(a)):
        a[i] = int(a[i])

    v = a[0]

    for i in range(1, len(a)):
        
        if i%2 == 0:
            if(v < 0):
                v -= a[i]
            else:
                v += a[i]
        
        else:
            if(v > 0):
                v -= a[i]
            else:
                v += a[i]
    
    v = abs(v)
    
    if v >= k:
        print(1)
    else:
        print(2)

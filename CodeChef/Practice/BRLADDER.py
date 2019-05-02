q = int(input())

for _ in range(q):

    inp = str(input()).split()

    a, b = int(inp[0]), int(inp[1])

    if b == a+2 or a == b+2:
        print("YES")
    
    elif min(a, b) % 2 != 0:
        if min(a, b) + 1 == b or min(a, b) + 1 == a:
            print("YES")
        else:
            print("NO")
    
    else:
        print("NO")

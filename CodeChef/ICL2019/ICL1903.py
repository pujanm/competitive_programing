t = int(input())

for _ in range(t):

    inp = str(input()).split()
    n, m, k = int(inp[0]), int(inp[1]), int(inp[2])

    remaining = n % m

    dist = 0

    if remaining == 0:
        print(0)

    elif m > n:
        print(-1)
    
    else:
        while(remaining != 0):
            remaining = remaining - k

            if remaining < 0:
                dist = -1
                break

            dist += 1 
        
        print(dist)
        


    


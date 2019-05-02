t = int(input())

for _ in range(t):

    inp = str(input()).split()
    a, b, n = int(inp[0]), int(inp[1]), int(inp[2])

    if n % 2 == 0:

        if a > b:

            print(int(a / b))

        else:
            
            print(int(b / a))

    else:

        if 2*a > b:

            print(int(2*a / b))

        else:

            print(int(b / 2*a))
            

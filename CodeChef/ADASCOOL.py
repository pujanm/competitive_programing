t = int(input())

for _ in range(t):
    n, m = input().split()

    n = int(n)
    m = int(m)

    if n%2 != 0 and m%2 != 0:
        print("NO")
    else:
        print("YES")

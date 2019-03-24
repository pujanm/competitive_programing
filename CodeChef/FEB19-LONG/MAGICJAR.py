t = int(input())

for _ in range(t):
    n = int(input())
    a = str(input()).split()

    for i in range(n):
        a[i] = int(a[i])

    sum = 0

    for i in a:
        sum += i-1
    sum += 1

    print(sum)

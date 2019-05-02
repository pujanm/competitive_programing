t = int(input())

def findMaxSquare(n):
    maxSquare = 1
    for i in range(n):
        if i**2 > n:
            maxSquare = (i-1)**2
            break

    return maxSquare

for _ in range(t):

    n = int(input())

    count = 0

    while(n != 0):

        sqaure = findMaxSquare(n)

        n = n - sqaure

        count += 1

    print(count)


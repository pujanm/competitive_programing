import sys
import math

sys.setrecursionlimit(int(math.pow(10, 9)))
try:
    t = int(input())

    def gcd(a,b):
        if b == 0:
            return a
        return gcd(b, a%b)


    def lcm(a,b):
        return (a*b) // gcd(a,b)

    for _ in range(t):
        inp = str(input())
        inp = inp.split()
        n = int(inp[0])
        a = int(inp[1])
        b = int(inp[2])
        k = int(inp[3])

        if a == b:
            print("Lose")

        else:
            score = n // a + n // b - 2 * (n // lcm(a,b))

            # print(score)

            if score >= k:
                print("Win")
            else:
                print("Lose")
except Exception as e:
    print(e)

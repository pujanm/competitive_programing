inp = str(input()).split()
n, d = int(inp[0]), int(inp[1])

a = str(input()).split()

for i in range(0, len(a)):
    a[i] = int(a[i])

a = a[d:] + a[:d]

for i in a:
    print(i, end=" ")
print()


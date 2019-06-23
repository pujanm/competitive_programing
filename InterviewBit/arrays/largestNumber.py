from functools import cmp_to_key 

A = list(map(int, str(input()).split()))

A = [str(i) for i in A]

def compare(x, y): return int(x+y > y+x) - int(y+x > x+y)
compare = cmp_to_key(compare)

A.sort(key=compare, reverse=True)
A = "".join(A)

for i in range(len(A)):
    if A[i] != "0":
        break

A = A[i:]

if A == "":
    print("0")
else:
    print(A)
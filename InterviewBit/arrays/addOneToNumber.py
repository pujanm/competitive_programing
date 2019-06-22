A = list(map(int, str(input()).split()))

A = A[len(A)-1::-1]

carry = 0
for i in range(len(A)):
    if i == 0 or carry == 1:
        A[i] += 1
    if A[i] % 10 == 0 and A[i] != 0:
        carry = 1
        A[i] = 0
    else:
        carry = 0

if carry == 1:
    A.append(1)
    
A = A[len(A)-1::-1]

pos = -1
for i in range(len(A)):
    if A[i] != 0:
        break
    else:
        pos = i

A = A[pos+1:]
print(A)
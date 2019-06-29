n = int(input())

A = []
for i in range(n):
    A.append([])
    for j in range(n):
        A[i].append(0)

direction = 0
T = 0
B = n - 1
L = 0
R = n - 1

element = 1
while (T <= B) and (L <= R):
    if direction == 0:
        for i in range(L, R+1):
            A[T][i] = element
            element += 1
        T += 1
    elif direction == 1:
        for i in range(T, B+1):
            A[i][R] = element
            element += 1
        R -= 1
    elif direction == 2:
        for i in range(R, L-1, -1):
            A[B][i] = element
            element += 1
        B -= 1
    elif direction == 3:
        for i in range(B, T-1, -1):
            A[i][L] = element
            element += 1
        L += 1
    direction = (direction + 1) % 4

print(A)
A = [
        [ 1, 2, 3, 4 ],
        [ 5, 6, 7, 8 ],
        [ 9, 10, 11, 12],
        [ 13, 14, 15, 16],
        [ 17, 18, 19, 20]
    ]
 
n = len(A) - 1
m = len(A[0]) - 1

direction = 0
T = 0
B = n
L = 0
R = m

spiral = []
while (T <= B) and (L <= R):

    if direction == 0:
        for i in range(L, R+1):
            spiral.append(A[T][i])
        T += 1
    elif direction == 1:
        for i in range(T, B+1):
            spiral.append(A[i][R])
        R -= 1
    elif direction == 2:
        for i in range(R, L-1, -1):
            spiral.append(A[B][i])
        B -= 1
    elif direction == 3:
        for i in range(B, T-1, -1):
            spiral.append(A[i][L])
        L += 1
    direction = (direction + 1) % 4

print(spiral)
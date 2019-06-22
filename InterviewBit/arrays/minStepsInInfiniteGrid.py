A = list(map(int, str(input()).split()))
B = list(map(int, str(input()).split()))


for i in range(1, len(A)):
    dist_X = abs(A[i] - A[i-1])
    dist_Y = abs(B[i] - B[i-1])
    
    steps += max(dist_X, dist_Y)

print(steps)
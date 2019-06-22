A = list(map(int, str(input()).split()))

max_sum = 0
ans = 0
for i in range(len(A)):
    if max_sum + A[i] > 0:
        max_sum += A[i]
    else:
        max_sum = 0
    ans = max(ans, max_sum)
if ans == 0:
     print(max(A))
else:
    print(ans)
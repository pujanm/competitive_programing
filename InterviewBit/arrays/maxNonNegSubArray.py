A = list(map(int, str(input()).split()))

sum = 0
max_sub = []
ans = -10**9
final_sub = []

for i in range(len(A)):
    if sum + A[i] >= sum and A[i] >= 0:
        sum += A[i]
        max_sub.append(A[i])
    else:
        sum = 0
        max_sub = []
    
    if ans < sum:
        ans = sum
        if len(final_sub) != 0:
            final_sub.pop()
        final_sub.append(max_sub)

    elif len(final_sub) != 0 and ans == sum and len(max_sub) > len(final_sub[len(final_sub)-1]):
            ans = ans
            final_sub.pop()
            final_sub.append(max_sub)

if final_sub != []:
    print(final_sub[len(final_sub)-1])
else:
    print([])
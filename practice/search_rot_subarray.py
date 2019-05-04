nums = list(map(int, str(input()).split()))
target = int(input())

l = 0
h = len(nums) - 1
m = (l + h) // 2

flag = 0

while l < h:
    if nums[m] == target:
        print(m)
        flag = 1
        break
    
    elif target > nums[m]:
        h = m-1
        m = (l + h) // 2

    else:
        l = m
        m = (l + h) // 2

if flag == 0:
    print(-1)
 
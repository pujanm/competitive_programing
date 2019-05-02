nums = list(map(int, str(input()).split()))

nums.sort()

triplets = []

l = 0
r = len(nums)-1

for i in range(len(nums)-2):
    
    if nums[i] > 0: break
    
    if i > 0 and nums[i] == nums[i-1]: continue

    l = i+1
    r = len(nums) - 1

    while l < r:
        total = nums[i] + nums[l] + nums[r]

        if total > 0: r -= 1
        
        elif total < 0: l += 1

        else: 
            triplets.append([nums[i], nums[l], nums[r]])

            while l < r and (nums[l] == nums[l+1]): l += 1
            while l < r and (nums[r] == nums[r-1]): r -= 1
            l += 1
            r -= 1


print(triplets)
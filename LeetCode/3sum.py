def threeSum(nums):
    # This commented out solution is highly inefficient with a complexity of O(n^3 + nlogn) 
    # triplets = []
    # processed = []

    # nums_hash = {}

    # for i in nums:
    #     if i not in nums_hash:
    #         nums_hash[i] = 1
    #     else:
    #         nums_hash[i] += 1

    # for i in range(len(nums)):
    #     for j in range(len(nums)):
    #         for k in range(len(nums)):
    #             if (nums[i] + nums[j] + nums[k] == 0) and (sorted([nums[i], nums[j], nums[k]]) not in processed):
                     
    #                 nums_hash[nums[i]] -= 1
    #                 nums_hash[nums[j]] -= 1
    #                 nums_hash[nums[k]] -= 1

    #                 if nums_hash[nums[i]] >= 0 and nums_hash[nums[j]] >= 0 and nums_hash[nums[k]] >= 0:
    #                     triplets.append([nums[i], nums[j], nums[k]])
    #                     processed.append(sorted([nums[i], nums[j], nums[k]]))

    #                 nums_hash[nums[i]] += 1
    #                 nums_hash[nums[j]] += 1
    #                 nums_hash[nums[k]] += 1

    
                    
    # print(triplets)
    return triplets

if __name__ == '__main__':

    threeSum([-1, 0, 1, 2, -1, -4])
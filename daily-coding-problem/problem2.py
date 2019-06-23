"""
Question[HARD]:

Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
"""

a = list(map(int, str(input()).split()))

left = [1 for i in range(len(a))]
right = [1 for i in range(len(a))]
prod = [1 for i in range(len(a))]

# Left side of element
for i in range(1, len(a)):
    left[i] = a[i-1] * left[i-1]

# Right side of element
for i in range(len(a)-2, -1, -1):
    right[i] = a[i+1] * right[i+1]

# Final product
for i in range(len(a)):
    prod[i] = left[i] * right[i]

print(prod)

"""
Time Complexity: O(n)
Space Complexity: O(n)
Auxiliary Space: O(n)
"""
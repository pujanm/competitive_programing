arr = []

for i in range(6):
    inp = list(map(int, str(input()).split()))
    arr.append(inp)

def maxHourGlassSum(arr):
    sums = []

    for i in range(4):
        for j in range(4):
            sum = 0
            for k in range(3):
                print(arr[i][j+k], end=" ")
                sum += arr[i][j+k]
            print()

            print(" " + str(arr[i+1][j+1]))
            sum += arr[i+1][j+1]

            for k in range(3):
                print(arr[i+2][j+k], end=" ")
                sum += arr[i+2][j+k]
            print()
            
            sums.append(sum)
    print(sums)
    maxSum = max(sums)
    print(maxSum)
    return maxSum

maxHourGlassSum(arr)
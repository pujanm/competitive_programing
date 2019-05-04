# Kadane's algorithm 

a = list(map(int, str(input()).split()))

count = 1
maximum = -9999999999

for i in a:

    count *= i

    if count > maximum:
        maximum = count

    # if count < 0:
    #     count = 1

print(maximum)
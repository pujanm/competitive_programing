# NOTE: This is an O(N) solution.

price = [90, 80, 70, 60, 50] 
n = len(price)

minima = []
maxima = []

i = 0

while (i < n-1) and (len(minima) < 2):
    
    # finding a local minima.
    while (i < n-1) and (price[i] >= price[i+1]):
        i += 1

    if i == n-1:
        break

    minima.append(price[i])

    # finding a local maxima.
    while (i < n-1) and (price[i] <= price[i+1]):
        i += 1
    
    maxima.append(price[i])

profit = 0
for i in range(len(minima)):
    profit += maxima[i] - minima[i]

print(profit)

# print(minima)    
# print(maxima)


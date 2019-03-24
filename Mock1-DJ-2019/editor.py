import math

operations = int(input())

num1 = math.ceil((operations - 2) / 2)
num2 = abs((operations - 2) - num1)

if num1 > num2:
    print(num1 + num2 * num1)
else:
    print(num2 + num1 * num2)

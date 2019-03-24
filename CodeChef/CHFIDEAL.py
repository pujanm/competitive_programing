import random

l = [1,2,3]

x = random.choice(l)
print(x, flush=True)
y = int(input())
for i in l:
    if i != x and i != y:
        z = i
        print(z, flush=True)
        break

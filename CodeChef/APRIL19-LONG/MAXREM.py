n = int(input())

a = str(input()).split()

for i in range(len(a)):
    a[i] = int(a[i])

new_a = []

max_el = max(a)

for i in range(len(a)):
    if a[i] != max_el:
        new_a.append(a[i])

if new_a != []:
        max_new_a = max(new_a)
else:
        max_new_a = 0
        
print(max_new_a % max_el)
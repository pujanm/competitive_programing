# EXAMPLES
#A = [1, 2, 0]
#A = [3, 4, -1, 1]
#A = [-8, -7, -6]
#A = [-8, 2]

# MAIN CODE
A = {i: 1 for i in A}
max_el = max(A)
min_el = min(A)

if max_el < 0 and min_el < 0:
    print(1)

else:
    flag = 0
    for i in range(1, max_el + 1):
        if i not in A:
            flag = 1

    if flag == 0:
        print(max_el + 1)
    else:
        flag = 0
        for i in range(1, max_el + 1):
            if i not in A and i > 0:
                print(i)
                break
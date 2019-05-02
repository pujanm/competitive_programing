t = int(input())

for _ in range(t):

    s = str(input())

    consecutives = []

    count = 0

    for i in s:
       
        if i == "1":
            count += 1

        else:
            if count != 0:
                consecutives.append(count)
                count = 0
            
        # print(i)
        # print("Count: ", count)
    if i == "1":
        consecutives.append(count)
    # print(consecutives)
    if len(consecutives) == 1:
        print("YES")
    else:
        print("NO")



t = int(input())

for _ in range(t):

    inp = str(input())
    inp = inp.split()
    
    s, e, l ,r = inp[0], inp[1], int(inp[2]), int(inp[3]) 

    days_range = [i for i in range(l, r+1)]
    # print(days_range)

    days = {
        "monday": 1,
        "tuesday": 2,
        "wednesday": 3,
        "thursday": 4,
        "friday": 5,
        "saturday": 6,
        "sunday": 7
    }
    
    # print(days[e] - days[s] + 1)

    count = 0

    for i in range(100):
        duration = days[e] - days[s] + 1

        if duration + 7 * i in days_range:
            count += 1

    
    if count == 0:
        print("impossible")
    elif count == 1:
        print(days[e] - days[s] + 1)
    else:
        print("many", count)

    
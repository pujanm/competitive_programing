t = int(input())

for _ in range(t):
    n = int(input())

    attack = str(input()).split()
    for i in range(n):
        attack[i] = int(attack[i])

    defence = str(input()).split()
    for i in range(n):
        defence[i] = int(defence[i])

    max = 0
    for i in range(n):
        # print(defence[i] - (attack[i-1] + attack[(i+1) % n]))
        if attack[i-1] + attack[(i+1) % n] < defence[i]:
            if max < defence[i]:
                max = defence[i]

    if max <= 0:
        print(-1)
    else:
        print(max)

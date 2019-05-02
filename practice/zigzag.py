t = int(input())

for _ in range(t):
    n = int(input())

    a = list(map(int, str(input()).split()))
    
    for i in range(len(a)-1):

        if i % 2 == 0:

            if a[i] > a[i+1]:
                temp = a[i]
                a[i] = a[i+1]
                a[i+1] = temp

        else:

            if a[i] < a[i+1]:
                temp = a[i]
                a[i] = a[i+1]
                a[i+1] = temp

    for i in a:
        print(i, end=" ")

    print()
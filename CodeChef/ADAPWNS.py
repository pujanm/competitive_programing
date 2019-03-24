t = int(input())

for _ in range(t):

    st = str(input())
    n = len(st)
    ada_score = 0
    suz_score = 0

    s = [i for i in st]

    j = 0
    while(j != 2*n):
        for i in range(len(s)):
            if s[i] == 'P':
                if i-2 >= 0:
                    if s[i-1] == '.' and s[i-2] == '.':
                        s[i] = '.'
                        s[i-2] = 'P'
                        if j%2 == 0:
                            ada_score += 1
                        else:
                            suz_score += 1

                    elif s[i-1] == '.' and s[i-2] == 'P':
                        s[i] = '.'
                        s[i-1] = 'P'

                        if j%2 == 0:
                            ada_score += 1
                            break
                        else:
                            suz_score += 1
                            break
                elif i-1 >= 0:
                    if s[i-1] == '.':
                        s[i] = '.'
                        s[i-1] = 'P'
                        if j%2 == 0:
                            ada_score += 1
                            break
                        else:
                            suz_score += 1
                            break

        j += 1
    # st = ""
    # for i in s:
    #     st += i
    # print("String:" + st)
    # print("ADA: " + str(ada_score))
    # print("SUZ: " + str(suz_score))

    if ada_score > suz_score:
        print("Yes")
    else:
        print("No")

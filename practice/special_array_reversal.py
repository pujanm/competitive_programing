t = int(input())

for _ in range(t):

    s = str(input())

    new_s = ""
    special_hash = {}
    count = 0
    for i in range(len(s)):
        if ord(s[i]) < 65 or ord(s[i]) > 122:
            if s[i] in special_hash:
                special_hash[s[i] + str(count)] = i
                count += 1

            else: 
                special_hash[s[i]] = i

        else:
            new_s += s[i]

    s = []        
    for i in range(len(new_s)-1, -1, -1):

        s += new_s[i]

    for i in special_hash:

        s += " "

        for j in range(len(s)-1, special_hash[i], -1):
            s[j] = s[j-1]

        s[special_hash[i]] = i[0]


    print("".join(s))
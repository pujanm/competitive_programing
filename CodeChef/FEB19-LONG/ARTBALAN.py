def is_balanced(s, hash_s):
    flag = 0
    val = hash_s[s[0]]
    for i in hash_s:
        if hash_s[i] != val:
            flag = 1

    if(flag == 0):
        return True
    return False


def balance_string(s, hash_s):
    n = len(hash_s)

    operations_arr = []

    for fact in range(1, len(s)+1):

        if fact <= 26:
            if len(s) % fact == 0:
                operations = 0
                hash_s1 = hash_s.copy()

                for i in hash_s:
                    if(int(len(s)/fact) - hash_s[i] < 0):
                        operations += abs(int(len(s)/fact) - hash_s[i])

                if(n > fact):
                    for i in range(n-fact):
                        minim = min(hash_s1.values())
                        keys = [i for i in hash_s1 if hash_s1[i] == minim]
                        operations += hash_s1.pop(keys[0], None)

                    operations_arr.append(operations)

                else:

                    operations_arr.append(operations)

    operations = min(operations_arr)
    # print(len(s))





    return operations

t = int(input())
for _ in range(t):
    s = str(input())

    hash_s = {}
    for i in s:
        if(i in hash_s.keys()):
            hash_s[i] += 1
        else:
            hash_s[i] = 1


    if(is_balanced(s, hash_s)):
        print(0)
    else:
        print(balance_string(s, hash_s))

from collections import Counter

t = int(input())

for _ in range(t):
    n = int(input())
    dicts = []
    for i in range(n):
        ingredient = str(input())

        dicts.append(Counter(ingredient))

    special_ingredient = dicts[0]
    for i in range(1, len(dicts)):
        special_ingredient &= dicts[i]

    print(len(special_ingredient))

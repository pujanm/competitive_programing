tasks = str(input()).split()

n = int(input())

tasks_map = {}

for i in tasks:

    if i not in tasks_map:

        tasks_map[i] = 1

    else:

        tasks_map[i] += 1

interval = 0

for i in tasks:

    if 
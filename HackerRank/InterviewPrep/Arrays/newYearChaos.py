t = int(input())

for _ in range(t):

    n = int(input())

    final_state = str(input()).split()

    for i in range(n):
        final_state[i] = int(final_state[i])

    initial_state = sorted(final_state)

    final_state_hash = {}
    initial_state_hash = {}

    for i in range(n):
        final_state_hash[initial_state[i]] = 0
        initial_state_hash[initial_state[i]] = 0

    for i in range(n):
        final_state_hash[final_state[i]] = i
        initial_state_hash[initial_state[i]] = i
    
    sum = 0

    for i in initial_state:
        if final_state_hash[i] > initial_state_hash[i]:
            if abs(final_state_hash[i] - initial_state_hash[i]) > 2:
                print("Too chaotic")
            sum += abs(final_state_hash[i] - initial_state_hash[i])


    print(sum)

    print(initial_state_hash)
    print(final_state_hash)


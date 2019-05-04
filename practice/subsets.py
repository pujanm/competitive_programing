# Using backtracking

a = list(map(int, str(input()).split()))

sets = []
B = [0 for i in range(len(a))]
bitstrings = []

def generateBitStrings(i):
    
    if i == len(a):
        bitstrings.append(B.copy())

    else:

        B[i] = 1
        generateBitStrings(i+1)

        B[i] = 0
        generateBitStrings(i+1)

def subsets(a):

    generateBitStrings(0)

    for bitstring in bitstrings:
        subset = []

        for i in range(len(bitstring)):

            if bitstring[i] == 1:

                subset.append(a[i])

        sets.append(subset)

    return sets


print(subsets(a))
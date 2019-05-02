# Inverting the given bit stream.
def flip(s):
    flipped_s = ""
    for i in range(len(s)):
        
        if s[i] == "1":
            flipped_s += "0"
        else:
            flipped_s += "1"
        
    return flipped_s

# Finding the index from where "1" starts.
def checkLastZero(s):
    index = None
    for i in range(len(s)-1, -1, -1):

        if s[i] == "1":
            index = i
            break
    
    return index+1
        

s = str(input())

required_s = "0" * len(s)

operations = 0

while(s != required_s):
    index = checkLastZero(s)

    s = flip(s)[:index] + s[index:]

    operations += 1

print(operations)
    
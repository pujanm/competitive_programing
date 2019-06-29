# EXAMPLES
#A = [ (1, 3), (2, 6), (8, 10), (15, 18) ]
#A = [ (1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6) ]
A = [ (4, 100), (48, 94), (16, 21), (58, 71), (36, 53), (49, 68), (18, 42), (37, 90), (68, 75), (6, 57), (25, 78), (58, 79), (18, 29), (69, 94), (5, 31), (10, 87), (21, 35), (1, 32), (7, 24), (17, 85), (30, 95), (5, 63), (1, 17), (67, 100), (53, 55), (30, 63), (7, 76), (33, 51), (62, 68), (78, 83), (12, 24), (31, 73), (64, 74), (33, 40), (51, 63), (17, 31), (14, 29), (9, 15), (39, 70), (13, 67), (27, 100), (10, 71), (18, 47), (48, 79), (70, 73), (44, 59), (68, 78), (24, 67), (32, 70), (29, 94), (45, 90), (10, 76), (12, 28), (31, 78), (9, 44), (29, 83), (21, 35), (46, 93), (66, 83), (21, 72), (29, 37), (6, 11), (56, 87), (10, 26), (11, 12), (15, 88), (3, 13), (56, 70), (40, 73), (25, 62), (63, 73), (47, 74), (8, 36) ]

# MAIN CODE
class Interval:
    def __init__(self, s=0, e=0):
        self.start = s
        self.end = e

for i in range(len(A)):
    A[i] = Interval(A[i][0], A[i][1])
 
A.sort(key=lambda x: x.start) # Sorts according to the first element in the tuple

n = len(A) - 1
i = 0
while i < n:
    a, b = A[i].start, A[i].end
    c, d = A[i+1].start, A[i+1].end

    if max(a, c) <= min(b, d): 
        A[i].start, A[i].end = (min(a, c), max(b, d))
        del A[i+1]
    else:
        i += 1
    
    n = len(A) - 1

for i in range(len(A)):
    A[i] = (A[i].start, A[i].end)
print(A)
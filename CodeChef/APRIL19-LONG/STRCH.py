t = int(input())

for _ in range(t):
    n = int(input())
    inp = str(input())

    s, x = inp.split()

    """
    eg: 

    Input:
    6

    abcabc c

    Output: 
    15

    Interpretation:
    a b c a b c ab bc ca ab bc abc bca cab abc abca bcab cabc abcab bcabc abcabc

    15 substrings contain c so output is 15
    """

    
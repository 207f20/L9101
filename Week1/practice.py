# Exercise:
# 1. Create a new Java class called PracticeFunctions
# 2. Write equivalent Java functions to the following three functions
#       complete with good Javadoc descriptions (see Course Notes 1.7)
#       for the two "mystery" functions

# method 1
def get_num(i):
    """
    Return twice the given integer if the given integer is odd.
    Else, if the integer is 0, return -1.
    If it's non-zero, return the same integer unchanged.
    """

    if (i % 2 == 1):
        return i * 2
    elif (i == 0):
        return -1
    else:
        return i
            
# method 2
def mystery1(n):
    """

    """

    s = 0
    i = 2
    while (i <= n):
        s += i
        i = i + 2

    return s

# method 3
def mystery2(n):
    """

    """

    s = 0
    for i in range(1, n, 2):
        s += i

    return s

print(get_num(5))
print(mystery2(8))

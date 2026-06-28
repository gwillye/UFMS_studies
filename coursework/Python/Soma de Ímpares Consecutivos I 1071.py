X = int(input())
Y = int(input())
Som = 0
if X == Y:
    print(Som)
if X > Y:
    while X > Y + 1:

        if Y % 2 != 0:
            Y = Y + 2
            if Y != X:
                Som = Y + Som
        else:
            Y = Y + 1
            Som = Y + Som
    print(Som)
if Y > X:
    while Y > X + 1:

        if X % 2 != 0:
            X = X + 2
            if X != Y:
                Som = X + Som
        else:
            X = X + 1
            Som = X + Som
    print(Som)

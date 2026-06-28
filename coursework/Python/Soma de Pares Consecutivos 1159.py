num = 0
cont = 0
X = 1
while True:
    X = int(input())
    if X == 0:
        break
    if X % 2 == 0:
        while cont < 5:
            num = X + num
            X = X + 2
            cont = cont + 1
    else:
        X = X + 1
        while cont < 5:
            num = X + num
            X = X + 2
            cont = cont + 1
    print(num)
    num = 0
    cont = 0

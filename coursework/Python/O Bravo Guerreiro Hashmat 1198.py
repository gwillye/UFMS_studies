while True:
    try:
        n1,n2 = input().split()
        n1 = int(n1)
        n2 = int(n2)
        dif = abs(n1 - n2)
        print(dif)
    except EOFError:
        break


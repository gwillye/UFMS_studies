n = int(input())
i = 1
while (i <= n):
    lst = input().split()
    tam = len(lst)
    msg_oculta = ""
    j = 0
    while j < tam:
        msg_oculta = msg_oculta + lst[j][0]
        j = j + 1
    i = i + 1
    print(msg_oculta)

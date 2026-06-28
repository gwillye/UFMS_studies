num = int(input())
cont = 2
if num == 1:
    print("0")
if num == 2:
    print("0 1")
if num > 2:
    print("0 1 ", end="")
    var1 = 0
    var2 = 1
    while cont < num:
        var3 = var1 + var2
        var1 = var2
        var2 = var3
        cont = cont + 1
        if cont != (num):
            print(var3, end=" ")
        if cont == (num):
            print(var3)

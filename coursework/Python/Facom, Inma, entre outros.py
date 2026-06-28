'''Se recebe cinco variáveis, e compara cada uma delas com os valores salvos para averiguar se são da Facom, da Inma ou de outro local. Após isso, salva quantos dos cinco valores
fazem parte destes, e imprime o resultado.'''
#Primeiro se recebe o valor das variáveis e os converte como inteiros
num1, num2, num3, num4, num5 = input().split()
num1 = int(num1)
num2 = int(num2)
num3 = int(num3)
num4 = int(num4)
num5 = int(num5)
#Agora se dá um valor de contador para os três resultados desejados e os chama com as variáveis que serão usadas
Facom = 0
Inma = 0
Outros = 0
#Após isso, se verifica se eles fazem parte da Facom, do Inma ou de outros cursos. Para isso, vamos usar um IF ELIF ELSE  e descobrir o valor do num1, num2 e em diante
if num1 == 1902 or num1 == 1904 or num1 == 1905 or num1 == 1906 or num1 == 1907:
    Facom = Facom + 1
elif num1 == 2201 or num1 == 2202 or num1 == 2203 or num1 == 2291:
    Inma = Inma + 1
else:
    Outros = Outros + 1
if num2 == 1902 or num2 == 1904 or num2 == 1905 or num2 == 1906 or num2 == 1907:
    Facom = Facom + 1
elif num2 == 2201 or num2 == 2202 or num2 == 2203 or num2 == 2291:
    Inma = Inma + 1
else:
    Outros = Outros + 1
if num3 == 1902 or num3 == 1904 or num3 == 1905 or num3 == 1906 or num3 == 1907:
    Facom = Facom + 1
elif num3 == 2201 or num3 == 2202 or num3 == 2203 or num3 == 2291:
    Inma = Inma + 1
else:
    Outros = Outros + 1
if num4 == 1902 or num4 == 1904 or num4 == 1905 or num4 == 1906 or num4 == 1907:
    Facom = Facom + 1
elif num4 == 2201 or num4 == 2202 or num4 == 2203 or num4 == 2291:
    Inma = Inma + 1
else:
    Outros = Outros + 1
if num5 == 1902 or num5 == 1904 or num5 == 1905 or num5 == 1906 or num5 == 1907:
    Facom = Facom + 1
elif num5 == 2201 or num5 == 2202 or num5 == 2203 or num5 == 2291:
    Inma = Inma + 1
else:
    Outros = Outros + 1
#Agora é só imprimir os contadores e ser feliz!
print("Facom: ""%i" %Facom)
print("Inma: ""%i" %Inma)
print("Outras unidades: ""%i" %Outros)


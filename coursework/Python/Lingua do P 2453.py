# lmsg = Ler mensagem e criar vetor(lista)
lmsg = input().split()
n = len(lmsg)

# Gerar outra lista a partir de lmsg, onde
# cada elemento de lmsg é transformado em
# uma string sem os p's adicionais.
normal = [""]*n
for i in range(n):
    lingua_p = lmsg[i]
    normal[i] = lingua_p[1::2]
    
decodificada = " ".join(normal)

# Mostrar a string de saída
print(decodificada)

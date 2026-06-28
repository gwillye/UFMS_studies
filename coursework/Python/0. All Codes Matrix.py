#Criar matriz e preencher valores depois
#Primeiro recebemos as linhas e colunas, neste caso, ambas ao mesmo tempo. 
inicio = input().split()
#Exemplo de entrada: 2 2
linhas = int(inicio[0])
colunas = int(inicio[1])
#Criamos uma lista que receberá os valores como a matriz inicial
mat = []
for i in range(linhas):
    linha = [0]*colunas
    mat.append(linha)
for i in range(linhas):
    for j in range(colunas):
      '''INSERIR AQUI QUAL O FORMATO DE CONVERSÃO QUE SERÁ USADO, INT, FLOAT OU STRING! INT ESTARÁ COMO PADRÃO!'''
      mat[i][j] = int(input())
      
 #Criar matriz enquanto preenche seus valores
matriz = []
lista = []
linhas = int(input())
colunas = int(input())
for i in range(linhas):
    for j in range(colunas):
        lista.append(int(input()))
    matriz.append(lista)
    lista = []

#Matriz que recebe todos os valores de cada linha de uma vez
#Primeiro, crio a lista e as variáveis
lista = input().split()
linhas = lista[0]
colunas = lista[1]
#Declaro as variáveis e transformo elas em numeros inteiros
linhas = int(linhas)
colunas = int(colunas)
#Crio uma lista para ser a matriz
mat = []
#Crio um contador e um laço para receber todos os valores e salvar eles na matriz
contador = 0
while contador < linhas:
  #Crio uma variavel para receber os valores de inicio, linha a linha
  inicio = input().split()
  cont = 0
  #Declaro um laço que vai rodar convertendo os numeros inseridos acima
  while len(inicio) > cont:
    #Ele recebe o mesmo valor na lista 'inicio' e adiciona a ele como um numero inteiro
    inicio[cont] = int(inicio[cont])
    cont += 1
  cont = 0
  #Salva o valor dessa linha na matriz
  mat.append(inicio)
  contador = contador + 1
  
  
#Multiplicação/Soma de elementos de duas matrizes
matrizm = []
for i in range(linhas):
    for j in range(colunas):
        '''usar + se for soma'''
        lista.append(matriz[i][j] *  mat[i][j])
    matrizm.append(lista)
    lista = []

#"Conversor normal"
#dontpad.com/willyeebrabo
#Comandos registrados
#Usando conversão na mesma linha
lista = input().split()
lista = [int(item) for item in lista]
#Sem conversão na mesma linha
inicio = input().split()
cont = 0
while len(inicio) > cont:
    inicio[cont] = int(inicio[cont])
    cont += 1
cont = 0


#"TODOS OS NUMEROS NA MESMA LINHA"
linhas = int(input())
colunas = int(input())
inicio = input().split()
cont = 0
while len(inicio) > cont:
    inicio[cont] = int(inicio[cont])
    cont += 1
cont = 0
mat = []
for i in range(linhas):
    linha = [0]*colunas
    mat.append(linha)
a = 0
for i in range(linhas):
    for j in range(colunas):
        mat[i][j] = inicio[a]
        a = a + 1
print(mat)


#"Excluir elementos impares"
lista = [1,2,3,4]
i = 0
par = []
while i < len(lista):
    if lista[i] % 2 == 0:
        par.append(lista[i])
    i = i + 1
print(par)
#OU USAR COMANDO DEL - DIFICIL 


#ANEXO PARA MATRIZES: CRIA UMA LISTA COM APENAS A LINHA ESCOLHIDA
num = int(input())
lin = []
cont = 0
while cont < colunas:
    lin.append(mat[num-1][cont])
    cont = cont + 1
print(lin)



#ANEXO PARA MATRIZES: CRIA UMA LISTA COM APENAS A COLUNA ESCOLHIDA
num = int(input())
col = []
cont = 0
while cont < linhas:
    col.append(mat[cont][num-1])
    cont = cont + 1
print(col)



#ANEXO PARA MATRIZES: CRIA UMA LISTA COM APENAS A DIAGONAL PRINCIPAL
dia = []
cont = 0
conta = 0
while linhas > cont and conta < colunas:
    dia.append(mat[cont][conta])
    cont = cont + 1
    conta = conta + 1
print(dia)



#Codigo para imprimir matriz com x linhas e y entradas
'''Minha ideia para este código era criar uma matriz com x linhas e y colunas, onde, de acordo com a quantidade de elementos, ela vai receber um numero z, crescendo como 1 o primeiro elemento até n elementos - 1.
Após isso, imprimir de forma ordenada a matriz com todos os valores. Quando uma entrada do tipo EOF (Ctrl + D) for recebida, ele encerra o laço.'''
#Iniciar laço
while True:
    #Enquanto a entrada for
    try:
        lista = input().split()
        if lista == []:
            break
        else:
            
            linhas = lista[0]
            colunas = lista[1]
            linhas = int(linhas)
            colunas = int(colunas)
            print(linhas, colunas)
            mat = []
            for i in range(linhas):
                linha = [0]*colunas
                mat.append(linha)
            a = 1
            for i in range(linhas):
                for j in range(colunas):
                    mat[i][j] = a
                    a = a + 1
            for i in range(linhas):
                for j in range(colunas): 
                    print(str(mat[i][j]) + " ", end="")
                print()
    except EOFError:
        break
        
        
        
#Função para transformar em int os valores iniciais de linhas e colunas de uma matriz: Modelo
def receber(MNI):
    y = input().split()
    cont = 0
    while 2 > cont:
        y[cont] = int(y[cont])
        cont += 1
    cont = 0
    return y

MNI = 0
MNI = receber(MNI)
#Agora os valores recebidos estão na variável MNI, e é so alterar para:
linhas = MNI[0]
colunas = MNI[1]




#Conversão para minusculas
def minusc (matriz):
    """
  CONVERSÃO DE MAISUCULAS PARA MINUSCULAS
  Essa função ira receber uma matriz com listas de caracteres podendo conter letras maiusculas/
        minusculas e irá localizar todas a letras maisucluas e converte-las em minusculas.
        Também irá desconsiderar o chr 'espaço', para a onversão usará a tabela ASCII, onde
        a ord entre 65- 90 é letra maiuscula e entre 97-122 é minuscula.
        
        A exceção para 'espaço' pode ser adaptada para outras situações, conforme o problema.
        
        Para a conversão será criada uma lista de saída que receberá os valores convertidos, que serão implementados
        a ela atravé do laço.

    """
    # será feito a leitura de qntas listas tem a matriz
    n = len(matriz)
    # e também de qnts chr tem a lista
    m = len(matriz[0])
    
    #será criada a matriz que receberá os valores convertidos
    mat_min = []
    
    # para percorrer a matriz é feito um laço de N indices
    for i in range(n):
        # e dentro um laço de M posições
        for j in range(m):
            
            #Para ignorar os " ", faz-se essa exeção de busca na matriz
            if mat_min[i][j] == " ":
                # se encontrá-lo, através do 'continue' o laço irá diretamente para o prox indice
                continue
            
            #Se o chr na pos[i][j] estiver na ordem entre 65-90 da tab ASCII
            #Isto é, letra maiuscula, este deve ser convertido.
            if 65 <= ord(matriz[i][j]) <= 90:
                # uma variavel vai receber sua ordenação na ASCII
                num = ord(matriz[i][j])
                # e será adiconada de +32 para ser convertida em sua letra equivalente minuscula
                #usando o comando chr() e o append() na pos [i] da matriz
                mat_min[i].apeeend(chr(num+32))
                
            else:
                #senão, só acrescenta o chr na pos [i] da matriz
                mat_min.apeeend(matriz[i][j])
                
    #após as conversões, retornar a matriz criada
    return (mat_min)


####################################################################


#Conversão para maiusculas
def maiusc (matriz):
    """
        CONVERSÃO DE MINUSCULAS PARA MAISUCULAS 
        Essa função ira receber uma matriz com listas de caracteres podendo conter letras maiusculas/
        minusculas e irá localizar todas a letras minusculas e converte-las em maiusculas.
        Também irá desconsiderar o chr 'espaço', para a onversão usará a tabela ASCII, onde
        a ord entre 65- 90 é letra maiuscula e entre 97-122 é minuscula.
        
        A exceção para 'espaço' pode ser adaptada para outras situações, conforme o problema.
        
        Para a conversão será criada uma lista de saída que receberá os valores convertidos, que serão implementados
        a ela atravé do laço.

    """
    # será feito a leitura de qntas listas tem a matriz
    n = len(matriz)
    # e também de qnts chr tem a lista
    m = len(matriz[0])
    
    #será criada a matriz que receberá os valores convertidos
    mat_min = []
    
    # para percorrer a matriz é feito um laço de N indices
    for i in range(n):
        # e dentro um laço de M posições
        for j in range(m):
            
            #Para ignorar os " ", faz-se essa exeção de busca na matriz
            if mat_min[i][j] == " ":
                # se encontrá-lo, através do 'continue' o laço irá diretamente para o prox indice
                continue
            
            #Se o chr na pos[i][j] estiver na ordem entre 97-122 da tab ASCII
            #Isto é, letra minuscula, este deve ser convertido.
            if 97 <= ord(matriz[i][j]) <= 122:
                # uma variavel vai receber sua ordenação na ASCII
                num = ord(matriz[i][j])
                # e será subtraida de 32 para ser convertida em sua letra equivalente maiuscula
                #usando o comando chr() e o append() na pos [i] da matriz
                mat_min[i].apeeend(chr(num-32))
                
            else:
                #senão, só acrescenta o chr na pos [i] da matriz
                mat_min.apeeend(matriz[i][j])
                
    #após as conversões, retornar a matriz criada
    return (mat_min)


####################################################



#Um código que verifica todos os elementos e os alinha de acordo com o menor. Foi feito para rodar com apenas 3 elementos.
linhas = int(input())
colunas = int(input())
inicio = input().split()
cont = 0
while len(inicio) > cont:
    inicio[cont] = int(inicio[cont])
    cont += 1
cont = 0
mat = []
for i in range(linhas):
    linha = [0]*colunas
    mat.append(linha)
a = 0
for i in range(linhas):
    for j in range(colunas):
        mat[i][j] = inicio[a]
        a = a + 1
print(mat)    
contador = 0
menores = 0
men0 = 0
men1 = 0
men2 = 0
val = 0
while contador < linhas:
    for i in range(colunas):
        if val == 0:
            menor = 999999
            val+=1
        if menor > mat[contador][i]:
            menor = mat[contador][i]
            menores = i
    if menores == 0:
        men0+=1
    elif menores == 1:
        men1+=1
    elif menores == 2:
        men2+=1
    contador+= 1
    val = 0
    menores = 0
print(men0, men1, men2)




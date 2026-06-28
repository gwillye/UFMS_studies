N = int(input())
horas = N // 3600
N = N % 3600
min = N // 60
N = N % 60
print("%i:%i:%i" %(horas, min, N))

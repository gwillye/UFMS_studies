#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void Sort(int vet[], int esq, int m, int dir)
{
int i, j, k;
int n1 = m - esq + 1;
int n2 = dir - m;
int Esq[n1], Dir[n2];
for (i = 0; i < n1; i++)
Esq[i] = vet[esq + i];
for (j = 0; j < n2; j++)
Dir[j] = vet[m + 1 + j];
i = 0;
j = 0;
k = esq;
while (i < n1 && j < n2) {
if (Esq[i] <= Dir[j]) {
vet[k] = Esq[i];
i++;
}
else {
vet[k] = Dir[j];
j++;
}
k++;
}
while (i < n1) {
vet[k] = Esq[i];
i++;k++;
}
while (j < n2) {
vet[k] = Dir[j];
j++;
k++;
}
}
void MergeSort(int vet[], int esq, int dir)
{
if (esq < dir) {
int m = esq + (dir - esq) / 2;
MergeSort(vet, esq, m);
MergeSort(vet, m + 1, dir);
Sort(vet, esq, m, dir);
}
}
void imprimir(int Vetor[], int tam)
{
int i;
for (i = 0; i < tam; i++)
printf("%d ", Vetor[i]);
printf("\n");
}
int main()
{
clock_t start, end;
double cpu_time_used;
start = clock();
int vet[] = {};
int tam = sizeof(vet) / sizeof(vet[0]);
MergeSort(vet, 0, tam - 1);
imprimir(vet, tam);
end = clock();
cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
printf("%f", cpu_time_used);return 0;
}


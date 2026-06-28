#include <stdio.h>
#include <time.h>
void imprimir(int vet[], int tam)
{
int i;
for (i=0; i < tam; i++)
printf("%d ", vet[i]);
printf("\n");
}
void troca(int *a, int *b)
{
int temp = *a;
*a = *b;
*b = temp;
}
void SelectionSort(int vet[], int n)
{
int i, j, min;
for (i = 0; i < n-1; i++)
{
min = i;
for (j = i+1; j < n; j++)
if (vet[j] < vet[min])
min = j;
if(min != i)
troca(&vet[min], &vet[i]);
}
}
int main()
{
clock_t start, end;
double cpu_time_used;
start = clock();int vet[] = {1,2,3,4,5,6,7,8,9,10};
int n = sizeof(vet)/sizeof(vet[0]);
SelectionSort(vet, n);
imprimir(vet, n);
end = clock();
cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
printf("%f", cpu_time_used);
return 0;
}

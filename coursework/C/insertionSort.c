#include <stdio.h>
#include <time.h>
void imprimir(int vet[], int n) {
for (int i = 0; i < n; i++) {
printf("%d ", vet[i]);
}
printf("\n");
}
void insertionSort(int vet[], int n) {
for (int i = 1; i < n; i++) {
int temp = vet[i];
int j = i - 1;
while (temp < vet[j] && j >= 0) {
vet[j + 1] = vet[j];
--j;
}
vet[j + 1] = temp;
}
}
int main() {
clock_t start, end;
double cpu_time_used;
start = clock();
int vet[] = {1,2,3,4,5,6,7,8,9,10};
int n = sizeof(vet) / sizeof(vet[0]);
insertionSort(vet, n);
imprimir(vet, n);
end = clock();cpu_time_used = ((double) (end - start)) /
CLOCKS_PER_SEC;
printf("%f", cpu_time_used);
return 0;
}

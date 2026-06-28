#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX 10
void QuickSort(int *a, int esq, int dir) {
int i, j, x, y;
i = esq;
j = dir;
x = a[(esq + dir) / 2];
while(i <= j) {
while(a[i] < x && i < dir) {
i++;
}
while(a[j] > x && j > esq) {
j--;
}
if(i <= j) {
y = a[i];
a[i] = a[j];
a[j] = y;
i++;
j--;
}
}
if(j > esq) {
QuickSort(a, esq, j);
}
if(i < dir) {
QuickSort(a, i, dir);
}
}int main()
{
clock_t start, end;
double cpu_time_used;
start = clock();
int i;
int vet[] = {1,2,3,4,5,6,7,8,9,10};
QuickSort(vet, 0, MAX - 1);
for(i = 0; i < MAX; i++)
{
printf("%d ", vet[i]);
}
end = clock();
cpu_time_used = ((double) (end - start)) /
CLOCKS_PER_SEC;
printf("%f", cpu_time_used);
return 0;
}

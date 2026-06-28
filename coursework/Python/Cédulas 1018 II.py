#include <stdio.h>
 
int main() {

int y, a, b, c, d, e, f, x, ya, yb, yc, yd, ye, g;

scanf("%d", &x);

ya= x%100;
a= (x - ya) /100;
yb= ya%50;
b= (ya - yb) /50;
yc= yb%20;
c= (yb - yc) /20;
yd= yc%10;
d= (yc - yd) /10;
ye= yd%5;
e= (yd - ye) /5;
g= ye%2;
f= (ye - g) /2;

printf("%d\n",x);
printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",a,b,c,d,e,f,g);

    return 0;
}

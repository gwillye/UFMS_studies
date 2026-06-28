//Descobrir a altura de uma árvore

#include <stdio.h>
#include <math.h>

int main()
{
    //Partindo do principio que precisamos descobrir a altura baseado em um numero X de elementos, e sabendo a semelhança que uma árvore possui com o código binário, o código será baseado em encontrar a maior potência de 2 inferior a quantidade X de elementos.

    //Receber variável responsável por receber os elementos
    int elem = 0;
    while (elem <= 0) 
    {
        scanf("%d", &elem);
    }
    //Agora se inicia um laço para descobrir qual a maior potência de 2 inferior ao número de elementos
    int cont = 0;
    while(pow(2, cont) <= elem)
    {
        cont++;
    }
    printf("%d", cont);

    return 0;
}


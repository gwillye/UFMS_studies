//2.1
/* Crie uma classe chamada Arrays, cujo objetivo é armazenar e manipular um vetor em java.

Sua classe deve possuir um único atributo:

arr - um Array de inteiros


Ela deve possuir dois construtores:

Arrays(int n) - recebe um inteiro n e constrói arr como um Array com n elementos. Todos eles devem ter o valor -1
Arrays(int n, int v) - recebe um inteiro n e um inteiro v e constrói arr como um Array com n elementos de valor v.
Por fim, sua classe deve apresentar dois métodos:

void resetaArray() - substitui todos os valores do array por zero (0).
int somaValores() - soma todos os valores do array e retorna essa soma. */

public class Arrays 
{
    int[] arr;
    public Arrays(int n)
    {
        arr = new int[n];
        for(int cont = 0; cont < arr.length; cont++)
        {
            arr[cont] = -1;
        }
    }
    
    public Arrays(int n, int v)
    {
        arr = new int[n];
        for(int cont = 0; cont < arr.length; cont++)
        {
            arr[cont] = v;
        }
	}


public void resetaArray()
{
    for(int cont = 0; cont < arr.length; cont++)
    {    
        arr[cont] = 0;
    }
}

public     int somaValores()
{
    int som = 0;
    for(int cont = 0; cont < arr.length; cont++)
    {
        som += arr[cont];
    }
    return som;
}
}
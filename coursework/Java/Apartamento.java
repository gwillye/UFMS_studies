/* Você deve escrever uma classe que simula um apartamento. Para isso, considere que sua classe possui os seguintes atributos:

int nMoradores - contabiliza o número de moradores do apartamento
int nQuartos - contabiliza o número de quartos do apartamento
double espaco - tamanho do apartamento em netros quadrados
double valorAluguel - valor do aluguel do apartamento
Um objeto do tipo Apartamento pode ser construído de duas maneiras diferentes:

Apartamento(int nQuar, double esp, double valorAlg) - inicializa todos os atributos, com exceção do número de moradores (permanece 0)
Apartamento(int nMor, int nQuar, double esp, double valorAlg) - inicializa todos os atributos, incluindo a quantidade atual de moradores do apartamento
Por fim, sua classe deve possuir os seguintes métodos:

double dividirAluguel() - retorna o valor do aluguel dividido pelo número de moradores
double valorporm2() - retorna o valor do apartamento por metro quadrado (dividindo os dois atributos)
boolean aumentarMoradores() - caso o número de moradores ainda seja menor que o número de quartos, aumente a quantidade de moradores do apartamento. 
Retorne true caso o método suceda em aumentar o número de moradores, ou false caso contrário.
boolean diminuirMoradores() - diminui o número de moradores do apartamento caso ele ainda seja maior que 0 (caso ainda exista alguém morando no apartamento). 
Caso contrário, não faça nada. Assim como no método acima, retorna true se a alteração foi um sucesso, ou false caso contrário. */

public class Apartamento
{
    //Atributos
    public int nMoradores;
    public int nQuartos;
    public double espaco;
    public double valorAluguel;

    //Construtores
    public Apartamento(int nQuar, double esp, double valorAlg)
    {
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    public Apartamento(int nMor, int nQuar, double esp, double valorAlg)
    {
        this.nMoradores = nMor;
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    //Métodos
    public double dividirAluguel()
    {
        double divAlg = this.valorAluguel / this.nMoradores;
        return divAlg;
    }

    public double valorporm2()
    {
        double valorM2 = this.valorAluguel / this.espaco;
        return valorM2;
    }

    public boolean aumentarMoradores()
    {
        if (this.nMoradores < this.nQuartos)
        {
            this.nMoradores+=1;
            return true;
        }
        else
        {
            return false;
        }
    }
public boolean diminuirMoradores()
    {
        if (this.nMoradores > 0)
        {
            this.nMoradores-=1;
            return true;
        }
        else
        {
            return false;
        }
    }
}

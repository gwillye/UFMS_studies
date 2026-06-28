//3.1
/*Escreva uma classe que representa um carro.

Essa classe deve possuir os seguintes atributos:

modelo: string que armazena o modelo do carro
nPortas: inteiro que representa o número de portas que o carro possui
nPassageiros: inteiro que representa o número de passageiros presente no carro
velocidade: ponto-flutuante de precisão dupla que representa a velocidade atual do carro
estaLigado: booleano que indica se o carro está ou não ligado
O construtor da classe deve ter o seguinte formato:

Carro (String mod,int nP, int nPas)
Onde mod é o modelo, nP indica o número de portas que o carro possui e nPas é o número de passageiros presente nos veículo. Você não deve alterar os valores das variáveis restantes no construtor. Mantenha os valores iniciais atribuídos pelo Java.

Por fim, sua classe deve possuir os seguintes métodos:

void ligaCarro(): altera o valor de estaLigado para true caso o carro não esteja ligado
void acelerar(double novaV): incrementa a velocidade do carro (caso o carro esteja ligado) com o valor recebido como parâmetro 
void frear(): reseta a velocidade do carro para zero.
String devolveInformacoes() - devolve uma String contendo informações sobre o veículo no seguinte formato:
"Carro de modelo _ com _ passageiros", onde os valores _ s’ são substituídos pelas informações requisitadas. */

public class Carro 
{
    //Atributos
    private String modelo;
    private int nPortas;
    private int nPassageiros;
    public double velocidade;
    private boolean estaLigado;

    //Construtor
    public Carro (String mod, int nP, int nPas)
    {
        this.modelo = mod;
        this.nPortas = nP;
        this.nPassageiros = nPas;
    }

    //Metodos
    public void ligaCarro()
    {
        this.estaLigado = true;
    }

    public void acelerar(double novaV)
    {
        if (this.estaLigado)
        {
            velocidade += novaV;
        }
    }
    public void frear()
    {
        velocidade = 0;
    }

    public String devolveInformacoes()
    {
        String infor = "Carro de modelo " + this.modelo + " com " + this.nPassageiros + " passageiros";
        return infor;
    }
}
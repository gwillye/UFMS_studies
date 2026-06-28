/* Você deve escrevar uma classe que representa um produto armazenado no estoque de uma loja de varejo. 
Essa classe deve representar o tipo de produto e também algumas características que são essenciais para acompanhar o seu estoque.
Essa classe deve possuir os seguintes atributos:
String nome - nome do produto
double valor - preço do produto em reais
double peso - peso do produto
int quantidade - quantidade do produto em estoque no armazém

Ela pode ser construída de duas maneiras:
Produto(String nNome, double nValor, double nPeso) - inicializa apenas as informações básicas (estoque zerado)
Produto(String nNome, double nValor, double nPeso, int quant) - inicializa apenas as informações básicas e uma quantidade do produto em estoque

Por fim, sua classe deve implementar os seguintes métodos:
double devolveValorAgregado() - devolve o valor total de todos os produtos em estoque (multiplica seu valor pela quantidade em estoque)
double devolvePesoAgregado() - devolve o peso total de todos os produtos em estoque
converteEmDolares(double cotacaoUSD) - recebe a cotação diária do dólar e retorna o valor em dólares para uma unidade do produto específico. */

public class Produto
{
    //Atributos
    public String nome;
    public double valor;
    public double peso;
    public int quantidade;

    //Construtores
    public Produto(String nNome, double nValor, double nPeso)
    {
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
    }

    public Produto(String nNome, double nValor, double nPeso, int quant)
    {
        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = quant;
    }

    //Métodos
    public double devolveValorAgregado()
    {
        double valorTotal = this.valor * this.quantidade;
        return valorTotal;
    }

    public double devolvePesoAgregado()
    {
        double pesoTotal = this.peso * this.quantidade;
        return pesoTotal;
    }

    public converteEmDolares(double cotacaoUSD)
    {
        double valorEmDolares = this.valor / cotacaoUSD;
        return valorEmDolares;  
    }
}
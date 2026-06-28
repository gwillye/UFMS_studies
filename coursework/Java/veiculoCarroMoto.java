/* Nesse exercício, você deve implementar três classes: Veículo, Carro e Moto

Para Veiculo, precisamos dos seguintes atributos:

String modelo
int nRodas
double peso
double velocidade
Para construir um veículo, precisamos informar seu modelo, peso e número de rodas.

Você deve implementar dois métodos:

void acelerar() - Esse método deve incrementar a velocidade do carro pela metade de seu peso
String toString() - você deve substituir o método herdado da classe Object para retornar o seguinte texto: Veiculo de modelo _, subsituindo _ pelo modelo do veículo.

Carro deve ser um filho de veículo, e deve ter um único atributo:

int nCilindros, que compõe o número de cilindros do motor
Para construir um Carro, você deve informar seu modelo, peso e número de cilindros.

void acelerar() - Esse método deve incrementar a velocidade do carro pela metade de seu peso somada ao número de cilindros.
String toString() - você deve substituir o método herdado da classe Object para retornar o seguinte texto: Carro de modelo _ com _ cilindros, subsituindo _ pelo modelo e número de cilindros do carro, respectivamente.

Carro deve ser um filho de veículo, e deve ter os seguintes atributos:

String cor
double comprimento
Para construir uma Moto, você deve informar seu modelo, peso, comprimento e cor.

void acelerar() - Esse método deve incrementar a velocidade do veículo pela metade de seu peso e subtraído pelo comprimento da moto.
String toString() - você deve substituir o método herdado da classe Object para retornar o seguinte texto: Veiculo de modelo _ e cor _, subsituindo _ pelo modelo e cor da moto, respectivamente. */

public class Veiculo {
    
    //Atributtes
    public String modelo;
    public double peso;
    public int nRodas;
    public double velocidade;

    //Constructor
    public Veiculo(String modelo, double peso, int nRodas)
    {
        this.modelo = modelo;
        this.peso = peso;
        this.nRodas = nRodas;
        
    }

    //Methods
    public void acelerar()
    {
        this.velocidade += this.peso / 2;
    }
    
    public String toString()
    {
        return "Veiculo de modelo " + this.modelo;
    }
}

public class Carro extends Veiculo
{
    //Atributtes
    public int nCilindros;

    //Constructor
    public Carro(String modelo, double peso, int nCilindros)
    {
        super(modelo, peso, 4);
        this.nCilindros = nCilindros;
    }

    //Methods
    public void acelerar()
    {
        super.acelerar();
        this.velocidade += nCilindros;
    }
    public String toString()
    {
        return "Carro de modelo " + this.modelo + " com " + this.nCilindros + " cilindros";
    }
}

public class Moto extends Veiculo
{
    //Atributtes
    public String cor;
    public double comprimento;

    //Constructor
    public Moto(String modelo, double peso, double comprimento, String cor)
    {
        super(modelo, peso, 2);
        this.comprimento = comprimento;
        this.cor = cor;
    }

    //Methods
    public void acelerar()
    {
        super.acelerar();
        this.velocidade -= this.comprimento;
    }

    public String toString()
    {
    return "Moto de modelo " + this.modelo + " e cor " + this.cor;
    }
}

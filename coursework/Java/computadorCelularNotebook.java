/* Nesse exercício, você deve descrever em classes o comportamento de três dispositivos: um computador genérico, um celular e um notebook.

Para um Computador, precisamos dos seguintes atributos:

int armazenamento (em GB)
int RAM (em GB)
double cpuClock (em GHz)
boolean reasfriamentoAtivo (sinaliza se é necessário ou não resfriamento ativo para esse dispositivo)
Você deve implementar dois métodos, ambos setters:

void setRAM(int RAM)
void setArmazenamento(int armazenamento)

Para construir um Computador, é necessário informar todos os seus atributos (na mesma ordem em que foram listados acima).

Notebook deve ser um filho de Computador, e deve incluir os seguintes atributos:

String fabricante - Marca do fabricante
double peso - peso do equipamento, em Kg
Você deve implementar um único método:
boolean ehPesado() - Devolve verdadeiro caso o notebook tenha mais de 2 Kg, ou falso caso contrário.

Para construir um Notebook, você deve informar seu armazenamento, RAM, clock de CPU, fabricante e peso. Considere aqui que todo notebook requer resfriamento ativo.

Celular também deve ser um filho de Computador, e deve incluir os seguintes atributos:

double tamanhoTela - tamanho da tela, em polegadas
String modelo - modelo do equipamento
int numApps - número de aplicativos instalados no celular
Você deve implementar um único método:
boolean instalaApp() - Deve tentar incrementar o número de aplicativos instalados no celular, caso não ultrapasse a quantidade de armazenamento presente no celular. Considere que todo aplicativo consome 2 GB de armazenamento. Você deve retornar verdadeiro caso o método tenha sucesso em incrementar o número de aplicativos, ou falso caso contrário.

Para construir um Celular, você deve informar seu armazenamento, RAM, clock de CPU, tamanho da tela, modelo e número de apps. Considere aqui que todo celular não requer resfriamento ativo. */
public class Computador
{
    //Atributtes
    protected int armazenamento;
    protected int RAM;
    protected double cpuClock;
    protected boolean resfriamentoAtivo;
    
    //Constructor
    protected Computador(int armazenamento, int RAM, double cpuClock, boolean resfriamentoAtivo)
    {
    this.armazenamento = armazenamento;
    this.RAM = RAM;
    this.cpuClock = cpuClock;
    this.resfriamentoAtivo = resfriamentoAtivo;
    }
    
    //Methods
    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }
    
    public void setArmazenamento(int armazenamento)
    {
        this.armazenamento = armazenamento;
    }
}

public class Celular extends Computador
{
     //Atributtes
    public double tamanhoTela;
    public String modelo;
    public int numApps;
    
    //Constructor
    public Celular(int armazenamento, int RAM, double cpuClock, double tamanhoTela, String modelo, int numApps)
    {
        super(armazenamento, RAM, cpuClock, false);
        this.tamanhoTela = tamanhoTela;
        this.modelo = modelo;
        this.numApps = numApps;
    }
    
    //Methods
    public boolean instalaApp()
    {
        if ((this.numApps * 2 + 2) < this.armazenamento)
        {
            this.numApps++;
            return true;
        }
        else
        {
            return false;
        }
    }
     
}
public class Notebook extends Computador
{
    //Atributtes
    public String fabricante;
    public double peso;
    
    //Constructor
    public Notebook( int armazenamento, int RAM, double cpuClock, String fabricante, double peso)
    {
        super(armazenamento, RAM, cpuClock, true);
        this.fabricante = fabricante;
        this.peso = peso;
    }
    
    //Methods
    public boolean ehPesado()
    {
        return this.peso > 2;
    }
    
}

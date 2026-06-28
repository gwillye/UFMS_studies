/* Nesse exercício, você deve implementar duas classes: Funcionário e Gerente.

Para Funcionario, precisamos dos seguintes atributos:

String nome
String CPF
double salario
double valorHoraTrabalho
int horasMensais
Você deve implementar dois métodos:

void calculaSalario() - Calcula o salário de um funcionário, que é dado pela multiplicação entre o valor de sua hora trabalhada pela quantidade de horas trabalhadas no mês
String toString() - você deve substituir o método herdado da classe Object para retornar o seguinte texto: Funcionario de nome _ e salario _, subsituindo _ pelo nome e salário do Funcionário, respectivamente.

Para construir um Funcionário, precisamos informar seu nome, CPF, valor por hora trabalhada e horas trabalhadas por mês. Também é importante calcular o salário do funcionário já em sua construção.

Gerente deve ser um filho de Funcionário, e deve incluir os seguintes atributos:

double bonus - bônus acrescentado ao salário para cada ano de serviço
int tempoServico - anos de serviço
Você deve implementar dois métodos:
void calculaSalario() - Calcula o salário de um Gerente, que é dado pelo valor base do salário de um funcionário comum, com acréscimo do bônus por ano de serviço multiplicado pela quantidade de anos de serviço do gerente na empresa.
String toString() - você deve substituir o método herdado da classe Object para retornar o seguinte texto: Gerente de nome _, salario _ e _ anos de serviço, subsituindo _ pelo nome, salário e tempo de serviço do gerente, respectivamente.

Para construir um Gerente, você deve informar seu nome, CPF, valor por hora de trabalho, horas de trabalho mensais, bônus e tempo de serviço. */
public class Funcionario
{
    
    //Atributtes
    protected String nome;
    protected String CPF;
    protected double salario;
    protected double valorHoraTrabalho;
    protected int horasMensais;
    
    //Constructor
    protected Funcionario (String nome, String CPF, double valorHoraTrabalho, int horasMensais)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.horasMensais = horasMensais;
        calculaSalario();
    }

    
    //Methods
    public void calculaSalario()
    {
        this.salario = this.valorHoraTrabalho * this.horasMensais;
    }
    
    public String toString()
    {
        return "Funcionario de nome " + this.nome + " e salario " + this.salario;
    }
}

public class Gerente extends Funcionario
{
    
    //Atributtes
    public double bonus;
    public int tempoServico;
    
    //Constructor
    public Gerente(String nome, String CPF, double valorHoraTrabalho, int horasMensais, double bonus, int tempoServico)
    {
        super(nome, CPF, valorHoraTrabalho, horasMensais);
        this.bonus = bonus;
        this.tempoServico = tempoServico;
        calculaSalario();
    }
    
    //Methods
    public void calculaSalario()
    {
        super.calculaSalario();
        this.salario += bonus * tempoServico;
    }
    
    public String toString()
    {
        return "Gerente de nome " + this.nome + ", salario " + this.salario + " e " + this.tempoServico + " anos de serviço";
    }
}

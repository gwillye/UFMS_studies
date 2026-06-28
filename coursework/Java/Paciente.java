/* Implemente no Eclipse uma classe chamada Paciente que possui um construtor que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o tipo double. Crie um método chamado calcularIMC() que calcula o índice de Massa Corporal de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)). Crie também um método chamado diagnostico() que utiliza o método calcularIMC() e retorna uma String de acordo com as seguintes faixas de valor:

Baixo peso muito grave = IMC abaixo de 16 kg/m²

Baixo peso grave = IMC entre 16 e 16,99 kg/m²

Baixo peso = IMC entre 17 e 18,49 kg/m²

Peso normal = IMC entre 18,50 e 24,99 kg/m²

Sobrepeso = IMC entre 25 e 29,99 kg/m²

Obesidade grau I = IMC entre 30 e 34,99 kg/m²

Obesidade grau II = IMC entre 35 e 39,99 kg/m²

Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²

Implemente no Eclipse uma classe chamada Principal em que se criam 3 instâncias da classe Paciente com valores diferentes e se imprime no console o resultado dos dois métodos criados. */

public class Paciente
{
	public static void main(String[] args)
	{
		Paciente p1 = new Paciente(70, 1.72);
		Paciente p2 = new Paciente(75, 1.7);
		Paciente p3 = new Paciente(55.5, 1.52);
		System.out.println("Paciente 01: " + p1.calculaIMC());
		System.out.println("Paciente 02: " + p2.calculaIMC());
	}
	
	//Atributtes
	protected double peso;
	protected double altura;
	
	//Constructor
	public Paciente(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	
	//Methods
	public String calculaIMC()
	{
		if (this.peso / (this.altura * this.altura) < 16)
		{
			return "Baixo peso muito grave";
		}
		else if (this.peso / (this.altura * this.altura) < 16.99)
		{
			return "Baixo peso grave";
		}
		else if (this.peso / (this.altura * this.altura) < 18.49)
		{
			return "Baixo peso";
		}
		else if (this.peso / (this.altura * this.altura) < 24.99)
		{
			return "Peso normal";
		}
		else if (this.peso / (this.altura * this.altura) < 29.99)
		{
			return "Sobrepeso";
		}
		else if (this.peso / (this.altura * this.altura) < 34.99)
		{
			return "Obesidade grau I";
		}
		else if (this.peso / (this.altura * this.altura) < 39.99)
		{
			return "Obesidade grau II";
		}
		else
		{
			return "Obesidade grau III (obesidade morbida)";
		}
		
	}
}

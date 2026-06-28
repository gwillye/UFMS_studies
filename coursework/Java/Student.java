// 2.3
/* You must create a Student class in order to store different information about a student.

This class must have the following attributes:

disciplinas: String array containing a list of disciplines that the student takes
nome: String storing the student's name
RGA: String that stores the student's RGA
medias: double precision floating-point array containing student grades in each of the subjects (in order)
anoDeIngresso: integer that stores the year in which the student joined
It must also have the following methods:

int tempoDeCurso(int ano): receives the current year and calculates the duration of the course that the student has, subtracting from the year of admission
double devolveCoeficienteRendimento(): calculates the student's performance coefficient as the arithmetic mean of all averages stored in the object
void imprimeNome(): prints the student's name on the screen
Boolean comparaAluno(Student B): Receives a second student (B) and returns true if he has the same RGA as the object of this method, or false otherwise
Finally, you must present the following developers:

Student(String novoNome, String rga, int anoIngresso): creates the student with name, RGA and entry year, and does not initialize the list of grades and subjects.
Student(String novoNome, String rga, int anoIngresso, String[] listaDisciplinas, double[] listaMedias): initializes the student with all possible attribute values */
public class Aluno
{
    public String nome;
    public String RGA;
    public String[] disciplinas;
    public double[] medias;
    public int anoDeIngresso;
    
    public int tempoDeCurso(int ano) 
    {
        return (ano - anoDeIngresso);
    }
    
    public double devolveCoeficienteRendimento() 
    {
        double soma = 0;
        for (int cont = 0; cont < medias.length; cont++)
        {
            soma += medias[cont]; 
        }
        return (soma / medias.length);
    }
    
    public void imprimeNome() 
    {
        System.out.println(nome);
    }
    
    public boolean comparaAluno(Aluno B) 
    {
        if (this.RGA == B.RGA)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
    
    public Aluno(String novoNome, String rga, int anoIngresso) 
    {
        nome = novoNome;
        RGA = rga;
        anoDeIngresso = anoIngresso;
    }

    public Aluno(String novoNome, String rga, int anoIngresso, String[] listaDisciplinas, double[] listaMedias) 
    {
        this.disciplinas = listaDisciplinas;
        this.medias = listaMedias;
        this.nome = novoNome;
        this.RGA = rga;
        anoDeIngresso = anoIngresso;
        for(int cont = 0; cont < listaDisciplinas.length; cont++)
        {
            disciplinas[cont] = listaDisciplinas[cont];
        }
        for(int cont = 0; cont < listaMedias.length; cont++)
        {
            medias[cont] = listaMedias[cont];
        }
        
    }
}

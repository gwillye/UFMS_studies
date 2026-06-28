//1.2
/* Escreva um programa que lê duas notas de um aluno (ambas doublegg) e calcule a média aritmética dessas notas. Caso essa média seja maior ou igual  a 6, imprima Aprovado. Caso contrário, imprima Reprovado */
import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        float not1 = input.nextFloat();
        float not2 = input.nextFloat();
        float media = (not1 + not2) / 2;
        
        if (media <6)
        {
            System.out.println("Reprovado");
        }
        else
        {
            System.out.println("Aprovado");
        }
        
    input.close();    
    }
}
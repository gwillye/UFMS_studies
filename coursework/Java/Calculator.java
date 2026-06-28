//1.4
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        for(int cont = 0; cont == 0; cont++)
        {
            double num1 = input.nextDouble();
            char sign = input.next().charAt(0);
            double num2 = input.nextDouble();
            double tot = 0;
            
            switch(sign)
            {
                case '*':
                    tot = num1 * num2;
                    System.out.println(tot);
                    cont--;
                    break;
                case '+':
                    tot = num1 + num2;
                    System.out.println(tot);
                    cont--;
                    break;
                case '/':
                    tot = num1 / num2;
                    System.out.println(tot);
                    cont--;
                    break;
                case '-':
                    tot = num1 - num2;
                    System.out.println(tot);
                    cont--;
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Sinal invalido, tente novamente");
                    
            }
        }
        
        
        input.close();
    }
}
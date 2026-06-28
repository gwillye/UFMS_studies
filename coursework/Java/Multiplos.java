//1.5 Multiplos entre 1 e 1000
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int tot = 0;
        
        for(int cont = 0; cont <= 1000; cont++)
        {
            if (cont % num == 0)
            tot += cont;
        }
        System.out.println(tot);
        
        input.close();   
    }
}
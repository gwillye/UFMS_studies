//1.6
import java.util.Scanner;
import java.lang.Math;

public  class quadradosPerfeitos {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        for(int cont = 0; cont < n; cont++)
        {
            int num = input.nextInt();
            if(Math.sqrt(num) % 1 == 0)
                System.out.println(num);
        }
        
        input.close();
    }
}
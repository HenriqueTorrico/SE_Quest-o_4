package excondicional4;
    import java.util.Scanner;
public class ExCondicional4 {

    public static void main(String[] args) {
        double del, x1, x2, a, b, c;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro valor");
        a = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        b = entrada.nextDouble();
        System.out.println("Digite o terceiro valor");
        c = entrada.nextDouble();
        del = Math.pow (b,2) - 4 * a * c;
        x1 = (-b) + Math.sqrt(del) / (2 * a);
        x2 = (-b) - Math.sqrt(del) / (2 * a);
        System.out.println("O delta vale" + del);
        if(a == 0)
        {
            System.out.print("O valor de A não pode ser zero");
        }    
        else
            if(del>0)
            {
                System.out.println(x1);
                System.out.print(x2);
            }
            else
                if(del == 0)
                {
                    System.out.print(x1);
                }
                else
                    if(del < 0)
                    {
                        System.out.println("()");
                        System.out.print("()");
                    }                
    }    
}

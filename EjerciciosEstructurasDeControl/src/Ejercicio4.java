import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        // Imprimir la secuencia de números impares de a hasta b. Use la sentencia for.

        System.out.println ("Ingrese a: ");
        System.out.println ("Ingrese b: ");

        int a, b;

        Scanner varScanner = new Scanner(System.in);
        a = varScanner.nextInt();
        b = varScanner.nextInt();

        for(int i=a; i<=b; i++)
        {
            if(i%2 == 1)
                System.out.println (i);
        }
    }
}

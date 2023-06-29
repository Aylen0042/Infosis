import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        // Imprimir la secuencia de números desde a hasta b, que sean múltiplos de x.
        // (a, b y x solicitados por teclado).

        System.out.println ("Ingrese a: ");
        System.out.println ("Ingrese b: ");
        System.out.println ("Ingrese x: ");

        int a, b, x;

        Scanner varScanner = new Scanner(System.in);
        a = varScanner.nextInt();
        b = varScanner.nextInt();
        x = varScanner.nextInt();

        for(int i=a; i<=b; i=i+x)
            System.out.println (i);
    }
}

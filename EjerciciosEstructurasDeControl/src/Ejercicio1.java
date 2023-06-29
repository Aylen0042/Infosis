import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        // Calcular si un número es par o no.

        System.out.println ("Ingrese un numero: ");
        int num;
        Scanner varScanner = new Scanner(System.in);
        num = varScanner.nextInt();

        if(num%2 == 0)
            System.out.println ("Es par");
        else
            System.out.println ("Es impar");
    }
}
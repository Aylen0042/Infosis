import java.util.Scanner;

public class Ejercicio6
{
    public static void main(String[] args)
    {
        // Obtener por teclado un número, calcular y mostrar su cuadrado y cubo.

        System.out.println ("Ingrese un numero: ");
        int num, cuadrado, cubo;

        Scanner varScanner = new Scanner(System.in);
        num = varScanner.nextInt();

        cuadrado = num * num;
        cubo = num * num * num;

        System.out.println ("Su cuadrado es: " + cuadrado);
        System.out.println ("Su cubo es: " + cubo);
    }
}

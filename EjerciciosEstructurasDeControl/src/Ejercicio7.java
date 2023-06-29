import java.util.Scanner;

public class Ejercicio7
{
    public static void main(String[] args)
    {
        // Realizar un programa que lea una cantidad de grados centígrados y lo
        // pase a grados Fahrenheit. La fórmula es F = 32 + ( 9 * C / 5)

        System.out.println ("Ingrese una cantidad de grados centígrados: ");
        int C, F;

        Scanner varScanner = new Scanner(System.in);
        C = varScanner.nextInt();

        F = 32 + (9 * C / 5);

        System.out.println ("Ese grado centígrado es " + F + " en Fahrenheit.");
    }
}

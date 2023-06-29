import java.util.Scanner;

public class Ejercicio9
{
    public static void main(String[] args)
    {
        // Programa que pase una velocidad en km/h a millas.

        System.out.println("Ingrese una velocidad en km: ");
        double km, milla=0;

        Scanner varScanner = new Scanner(System.in);
        km = varScanner.nextInt();

        milla = km / 1.609344;

        System.out.println(km + " en km es " + milla + " en millas.");
    }
}

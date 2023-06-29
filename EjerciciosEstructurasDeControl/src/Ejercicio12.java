import java.util.Scanner;

public class Ejercicio12
{
    public static void main(String[] args)
    {
        // Determinar si un año ingresado por teclado es bisiesto o no.

        int anio;

        System.out.println("Ingrese un año: ");

        Scanner varScanner = new Scanner(System.in);
        anio = varScanner.nextInt();

        if(anio%4 == 0)
            System.out.println("Es un año bisiesto");
        else
            System.out.println("No es un año bisiesto");
    }
}

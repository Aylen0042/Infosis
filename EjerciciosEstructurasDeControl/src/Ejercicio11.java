import java.util.Scanner;

public class Ejercicio11
{
    public static void main(String[] args)
    {
        // Una planta que fabrica perfiles de hierro posee un lote de “n” piezas.
        // Confeccionar un programa que pida ingresar por teclado la cantidad
        // de piezas a procesar y luego ingrese la longitud de cada perfil;
        // sabiendo que la pieza cuya longitud esté comprendida entre el rango
        // de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas
        // aptas que hay en el lote.

        int cant, cont=0;
        double longitud;

        System.out.println("Ingrese la cantidad de piezas a procesar: ");

        Scanner varScanner = new Scanner(System.in);
        cant = varScanner.nextInt();

        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese la longitud: ");
            longitud = varScanner.nextDouble();

            if(longitud >= 1.20 && longitud <= 1.30)
                cont++;
        }

        System.out.println("Hay: " + cont + " piezas aptas en el lote");
    }
}

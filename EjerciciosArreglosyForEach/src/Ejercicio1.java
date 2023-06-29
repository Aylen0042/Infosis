import java.util.Scanner;

public class Ejercicio1
{
    public static void main(String[] args)
    {
        // Declare, instancie e inicialice en una sola línea los siguientes arreglos:
        // a. Un arreglo que contenga letras, con los siguientes valores: a, b, c, d, e
        // b. Un arreglo que contenga números con los siguientes valores: 5, 6, 7, 8, 9
        // Imprima los arreglos sin usar construcciones de iteración.

        int[] N = {5, 6, 7, 8, 9};
        char[] L = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("A: " + L[0]);
        System.out.println("B: " + L[1]);
        System.out.println("C: " + L[2]);
        System.out.println("D: " + L[3]);
        System.out.println("E: " + L[4]);
        System.out.println("");
        System.out.println("5: " + N[0]);
        System.out.println("6: " + N[1]);
        System.out.println("7: " + N[2]);
        System.out.println("8: " + N[3]);
        System.out.println("9: " + N[4]);
    }
}

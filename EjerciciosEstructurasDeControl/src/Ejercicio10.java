import java.util.Scanner;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args)
    {
        // Calcular la hipotenusa de un triángulo, siguiendo el teorema de pitágoras.

        double catetoA, catetoB, hipotenusa;

        System.out.println("Ingrese el cateto A: ");
        System.out.println("Ingrese el cateto B: ");

        Scanner varScanner = new Scanner(System.in);
        catetoA = varScanner.nextInt();
        catetoB = varScanner.nextInt();

        hipotenusa = (catetoA*catetoA) + (catetoB*catetoB);

        System.out.println("La hipotenusa es: " + Math.sqrt(hipotenusa));
    }
}
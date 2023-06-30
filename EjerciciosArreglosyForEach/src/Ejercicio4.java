import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        // Defina un arreglo de String que almacene nombres, otro de enteros que almacene edades de la
        // misma dimensión.
        //
        // a. Cargue los arreglos por teclado, donde la misma posición de cada arreglo sea los datos de
        //  una persona.
        //      i. Por ejemplo: nombres[0] = “juan”; edad[0] = 22; //Juan tiene 22 años.
        // b. Recorra ambos arreglos y muestre por pantalla el nombre de la persona con su edad.
        // c. Cree otro arreglo de reales para el salario para mantener el sueldo correspondiente a las
        //  personas cargadas en el arreglo.
        //  Cargue el salario correspondiente en la misma posición de los otros arreglos.
        //      i. Defina un arreglo, de nombre descuentos, que sea capaz de contener los importes de los
        //          descuentos de tipo entero que se aplican a las personas definidas anteriormente. El
        //          arreglo contiene el descuento en porcentaje. Ejemplo:
        //              1. 10
        //              2. 5
        //              3. 2
        // d. Recorra el arreglo salario y aplique los descuentos guardados en el arreglo descuentos, de
        //  la siguiente manera:
        //      i. Al salario que está en el índice 0 le corresponde el descuento que está en el índice
        //          2 de descuentos.
        //      ii. Al salario que está en el índice 1 le corresponde el descuento que está en el índice
        //          1 de descuentos.
        //      iii. Al salario que está en el índice 2 le corresponde el descuento que está en el índice
        //          0 de descuentos.
        //      iv. Muestre por pantalla el nombre de la persona, la edad y el salario final.

        int cant=6, max=cant-1, min=0;
        String[] nombres = new String[cant];
        int[] edades = new int[cant];
        int[] salarios = new int[cant];
        int[] descuentos = new int[cant];
        int[] conDescuento = new int[cant];

        Scanner varScanner = new Scanner(System.in);

        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese un nombre: ");
            nombres[i] = varScanner.nextLine();
        }

        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese su edad: ");
            edades[i] = varScanner.nextInt();
        }

        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese su descuento: ");
            descuentos[i] = varScanner.nextInt();
        }

        for(int i=0; i<cant; i++)
        {
            System.out.println("Ingrese su salario: ");
            salarios[i] = varScanner.nextInt();

            conDescuento[i] = (salarios[min] * descuentos[max]) / 100;
            conDescuento[i] = salarios[min] - conDescuento[i];

            min++;
            max--;
        }

        for(int i=0; i<cant; i++)
        {
            System.out.println(nombres[i] + " tiene " + edades[i] + " años y cobra " + conDescuento[i] + " pesos.");
        }

    }
}

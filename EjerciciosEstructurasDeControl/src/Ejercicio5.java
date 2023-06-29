import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args) {
        // Imprimir la secuencia de fibonacci desde 1 hasta n.
        // ● La secuencia de Fibonacci se genera sumando dos números
        // consecutivos para obtener el siguiente. Entonces:
        // f1 = f2 = 1
        // fn = fn-1 + fn-2 para n >= 3
        // La serie Fibonacci resultante es: 1, 1, 2, 3, 5, 8, 13, etc...

        System.out.println("Ingrese un numero para terminar la secuencia: ");

        int ultimoNum, num=0, num2=1, suma=1;
        Scanner varScanner = new Scanner(System.in);
        ultimoNum = varScanner.nextInt();

        System.out.println(num);

        for (int i = 1; i < ultimoNum; i++)
        {
            System.out.println("Suma: " + suma);

            suma = num + num2;
            num = num2;
            num2 = suma;
        }
    }
}

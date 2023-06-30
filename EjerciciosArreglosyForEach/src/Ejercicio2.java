public class Ejercicio2
{
    public static void main(String[] args)
    {
        // Defina usando alguna construcción de iteración:
        // a. Un arreglo que contenga de forma consecutiva y ordenada los primeros 1000 números enteros.
        // b. Un arreglo que contenga de forma consecutiva y ordenada los números enteros comprendidos entre
        // 5000 y 6000.
        // c. Un arreglo que contenga de forma consecutiva y ordenada los números enteros pares comprendidos
        // entre 5000 y 6000.
        // Imprima los arreglos usando la construcción de iteración forEach.

        int[] A = new int[1001];
        int[] B = new int[6001];
        int[] C = new int[6001];

        for (int i : A)
        {
            for(int j=0; j<=1000; j++)
                A[j] = j;

            System.out.println("A: " + i);
        }

        for(int j=5000; j<=6000; j++)
        {
            B[j] = j;
            System.out.println("B: " + B[j]);
        }

        for(int j=5000; j<=6000; j++)
        {
            if (B[j] % 2 == 0)
            {
                C[j] = j;
                System.out.println("C: " + C[j]);
            }
        }
    }
}
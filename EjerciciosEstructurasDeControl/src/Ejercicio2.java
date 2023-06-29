public class Ejercicio2
{
    public static void main(String[] args)
    {
        // Mostrar los primeros 200 números pares. Use la sentencia while.

        int num=0;

        while(num <= 200)
        {
            if(num%2 == 0)
                System.out.println (num);

            num++;
        }
    }
}

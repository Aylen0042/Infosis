import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        // Crear una clase llamada CalculaDias con un método main, que le
        // solicite al usuario dos enteros que indican un mes y un año. El método
        // debe usar la estructura switch, imprimir un mensaje indicando cuántos
        // días tiene el mes de ese año. Tener en cuenta los años bisiestos.

        CalcularDias C =  new CalcularDias();
        C.main();
    }

    public static class CalcularDias
    {
        public void main()
        {
            int mes, anio;
            System.out.println("Ingrese un numero para el mes: ");
            System.out.println("Ingrese un numero para el año: ");

            Scanner varScanner = new Scanner(System.in);
            mes = varScanner.nextInt();
            anio = varScanner.nextInt();

            switch(mes)
            {
                case 1: System.out.println("Este mes tiene 31 días");
                    break;
                case 2: if(anio%4 == 0)
                            System.out.println("Este mes tiene 29 días");
                        else
                            System.out.println("Este mes tiene 28 días");
                    break;
                case 3: System.out.println("Este mes tiene 31 días");
                    break;
                case 4: System.out.println("Este mes tiene 30 días");
                    break;
                case 5: System.out.println("Este mes tiene 31 días");
                    break;
                case 6: System.out.println("Este mes tiene 30 días");
                    break;
                case 7: System.out.println("Este mes tiene 31 días");
                    break;
                case 8: System.out.println("Este mes tiene 31 días");
                    break;
                case 9: System.out.println("Este mes tiene 30 días");
                    break;
                case 10: System.out.println("Este mes tiene 31 días");
                    break;
                case 11: System.out.println("Este mes tiene 30 días");
                    break;
                case 12: System.out.println("Este mes tiene 31 días");
                    break;
            }
        }
    }
}

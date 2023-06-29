import java.util.Scanner;

public class Ejercicio8
{
    public static void main(String[] args)
    {
        // Un programa que que le pida al usuario que área calcular. Las
        // opciones son: 1 - Rectángulo, 2 - Cuadrado, 3 - Círculo, 4 - Triángulo. En
        // base a la opción ingresada le pida los datos correspondientes y
        // muestre el resultado. Use la sentencia switch.

        System.out.println("Ingrese un numero del 1 al 4 para calcular un área: ");
        int area, A, B, result;

        Scanner varScanner = new Scanner(System.in);
        area = varScanner.nextInt();

        switch(area)
        {
            case 1: System.out.println("Ingrese un lado: ");
                    A = varScanner.nextInt();
                    System.out.println("Ingrese otro lado: ");
                    B = varScanner.nextInt();
                    result = A*2 + B*2;
                    System.out.println("Su area es: " + result);
                break;
            case 2: System.out.println("Ingrese un lado: ");
                    A = varScanner.nextInt();
                    result = A*4;
                    System.out.println("Su area es: " + result);
                break;
            case 3: System.out.println("Ingrese el radio: ");
                    A = varScanner.nextInt();
                    B = A*A;
                    double result2 = Math.PI * B;
                    System.out.println("Su area es: " + result2);
                break;
            case 4: System.out.println("Ingrese la base: ");
                    A = varScanner.nextInt();
                    System.out.println("Ingrese la altura: ");
                    B = varScanner.nextInt();
                    result = (A*B) / 2;
                    System.out.println("Su area es: " + result);
                break;
            default: System.out.println("Esa opción no existe.");
        }
    }
}

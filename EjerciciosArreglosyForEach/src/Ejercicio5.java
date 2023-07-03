import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        // Implemente los siguientes incisos:
        // a. Defina un arreglo bidimensional de enteros que corresponda a las notas del boletín
        //  de un alumno el tamaño será de 3 filas x 5 columnas (las filas pertenecen a los trimestres
        //  y las columnas a las materias).
        // b. Cree una variable String para almacenar el nombre del alumno.
        // c. Una variable llamada materias de tipo String[] que contenga las materias Matemática, Física,
        //  Lengua, Música y Ed. Física.
        // d. Cargue las notas correspondientes a cada materia y cada trimestre.
        // e. Imprima el nombre y apellido del alumno. Usando el forEach imprima el arreglo de materias,
        //  y luego su boletín. El boletín deberá contener el formato del pdf.

        int[][] notas = new int[3][5];
        String nombre = "Juan Perez";
        String[] materias = {"Matematica", "Fisica", "Lengua", "Musica", "Ed. Fisica"};

        notas[0][0] = 5;
        notas[0][1] = 8;
        notas[0][2] = 9;
        notas[0][3] = 10;
        notas[0][4] = 2;

        notas[1][0] = 8;
        notas[1][1] = 1;
        notas[1][2] = 8;
        notas[1][3] = 2;
        notas[1][4] = 7;

        notas[2][0] = 6;
        notas[2][1] = 7;
        notas[2][2] = 9;
        notas[2][3] = 5;
        notas[2][4] = 9;

        System.out.println("Nombre: " + nombre);

        System.out.println("Materias:");
        for (String i : materias)
            System.out.println(i);

        System.out.println("");
        System.out.println("Boletín de notas:");
        for (int trimestre = 0; trimestre < notas.length; trimestre++)
        {
            System.out.println("Trimestre " + (trimestre + 1) + ":");
            for (int materia = 0; materia < notas[trimestre].length; materia++)
            {
                System.out.println(materias[materia] + ": " + notas[trimestre][materia]);
            }
            System.out.println();
        }
    }
}

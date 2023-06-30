public class Ejercicio3
{
    public static void main(String[] args)
    {
        // Defina un arreglo de String que contenga los siguientes valores:
        // “Argentina”, “Brasil”, “Uruguay”, “Paraguay” y “Chile”.
        // Defina una aplicación que sea capaz de copiar los contenidos de este
        // primer arreglo (respetando el orden en el que fueron dados) sobre un
        // segundo arreglo, y además incorpore a “Bolivia” al nuevo arreglo.

        String[] paises = {"Argentina", "Brasil", "Uruguay", "Paraguay", "Chile"};
        String[] copiados = new String[5];

        copiados[0] = paises[0];
        copiados[1] = paises[1];
        copiados[2] = paises[2];
        copiados[3] = paises[3];
        copiados[4] = "Bolivia";

        for(String i : copiados)
            System.out.println("Copiados: " + i);
    }
}

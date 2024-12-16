import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos la instancia de la clase de PanelesSolares y Opcion2
        PanelesSolares paneles = new PanelesSolares();
        Opcion2 opcion = new Opcion2();

        //Saludamos al usuario por consola:
        System.out.println("Hola, bienvenid@ a Ruuf Solar" + '\n');
        System.out.println("Este es un programa que te ayudará a verificar cuántos paneles solares necesitas para tu techo." + '\n');

        //Definir las dimensiones de los paneles solares y el techo.

        //Preguntamos los valores por consola al usuario.
        Scanner input = new Scanner(System.in);

        //Primero preguntamos las dimensiones del techo.
        System.out.println("Introduce el ancho del techo: ");
        double x = input.nextInt();

        System.out.println("Introduce el alto del techo: ");
        double y = input.nextInt();

       /*
        Solo pedimos el valor del techo porque es una información que no conocemos, las dimensiones de los
        paneles solares ya las tenemos definidas dentro de nuestra empresa.
        */

        // Para este ejemplo, las dimensiones de los paneles son:

        int a = 2; // Alto del panel solar.
        int b = 1; // Ancho del panel solar.

        //Ahora llamamos al metodo de la clase y mostraremos el resultado.
        double calculoResultado = paneles.calculo(x, y, a, b);
        System.out.println("La cantidad de paneles solares que necesitas son: " + calculoResultado);

        //Un mensaje por consola para explicar el resultado en caso de que no sea un entero.
        System.out.println("El resultado en decimal, nos informa que hay un espacio en el cual necesitariamos medio panel para cubrir toda el area");

        //Salto de linea solo para una mejor Ux
        System.out.println('\n');

        //Y este mensaje es el resultado de la Opcion2 como plus
        double resultadoOpcion2 = Opcion2.calculo2(x, y, a, b);
        System.out.println("El resultado de la opcion2 es: " + resultadoOpcion2);

        //Este mensaje para explicar el resultado
        System.out.println("En este caso, con las dimensiones del techo podemos obtener un un panel solar mas, ya que al tener medio panel en el primer caso y ahora duplicamos su tamaño, menos si mismo.");

    }
}
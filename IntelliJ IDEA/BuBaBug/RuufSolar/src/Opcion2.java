public class Opcion2 {

    /*
    Para la Opcion2 tenemos como mi propia suposicion que las
    dimensiones serian las mismas del techo del cliente anterior.
     */
    public static int calculo2(double x, double y, double a, double b) {

        //Orientación horizontal según el ejercicio ( b: ancho y a: alto, x: ancho y y: alto).
        double dimension2 = (((x * y) / (a * b)) * 2) - 1;
        return (int) dimension2;

        }
    }

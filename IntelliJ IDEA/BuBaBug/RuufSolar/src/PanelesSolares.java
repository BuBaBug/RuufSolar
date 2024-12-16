
public class PanelesSolares {

    //Acá vamos a definir las dimensiones del techo y las dimensiones de los paneles solares.
    public double calculo(double x, double y, double a, double b) {

        //Orientación horizontal según el ejercicio ( b: ancho y a: alto, x: ancho y y: alto).
        double dimensionHorizontal = (x * y) / (a * b);

        //Orientación vertical según el ejercicio ( b: ancho y a: alto, y: alto y x: ancho).
        double dimensionVertical = (y * x) / (b * a);

        if (dimensionHorizontal >= dimensionVertical) {
            return dimensionHorizontal;
        }else {
            return dimensionVertical;
        }

        /*
        El if lo coloco en este caso como suplente de algún test, para comprobar que el código compile siempre el mismo
        resultado entre las dos dimensiones, aunque sabemos que por orientación el resultado fue igual.
        (Solo si es que tal vez el usuario su ancho sea el largo y su largo sea el ancho).
         */

    }
}

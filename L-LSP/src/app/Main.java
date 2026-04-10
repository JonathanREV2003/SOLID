
//EJEMPLO INCORRECTO
/* package app;

public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Cuadrado();
        r.setAncho(5);
        r.setAlto(10);

        System.out.println(r.getArea()); // Esperado: 50, Real: 100 ❌
    }
}
*/

//EJEMPLO CORRECTO
package app;

import figura.Cuadrado;
import figura.Rectangulo;
import figura.Figura;

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Rectangulo(5, 10);
        Figura f2 = new Cuadrado(5);

        System.out.println("Área rectángulo: " + f1.getArea());
        System.out.println("Área cuadrado: " + f2.getArea());
    }
}


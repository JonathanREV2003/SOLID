package I_ISP;

//Clase Humano implementa ambas interfaces porque
//puede trabajar y comer.

public class Humano implements Trabajable, Comible {

    @Override
    public void trabajar() {
        System.out.println("El humano está trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("El humano está comiendo...");
    }
}
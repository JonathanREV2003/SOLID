package I_ISP;

//Clase Robot solo implementa Trabajable.

public class Robot implements Trabajable {

    @Override
    public void trabajar() {
        System.out.println("El robot está trabajando...");
    }
}
package I_ISP;

public class Main {
    public static void main(String[] args) {

        Humano humano = new Humano();
        Robot robot = new Robot();

        humano.trabajar();
        humano.comer();

        robot.trabajar();
       
    }
}
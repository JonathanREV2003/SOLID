public class EmpleadoCafe {

    // Este método se encarga de preparar el café para el cliente y luego despacharlo y cobrarlo. 
    // Este metodo esta mal

    public void prepararCafe() {
        System.out.println("Preparando café...  ");
    }

    public void despacharCafe() {
        System.out.println("Entregando café al cliente...");
    }

    public void cobrarCafe() {
        System.out.println("Cobrando el café...");
    }

    public void procesarPedido() {
        prepararCafe();
        despacharCafe();
        cobrarCafe();
    }
}
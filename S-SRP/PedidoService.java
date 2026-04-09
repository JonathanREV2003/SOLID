public class PedidoService {

    private Barista barista;
    private Despachador despachador;
    private Cajero cajero;

    public PedidoService() {
        this.barista = new Barista();
        this.despachador = new Despachador();
        this.cajero = new Cajero();
    }

    public void procesarPedido() {
        barista.prepararCafe();
        despachador.entregarCafe();
        cajero.cobrarCafe();
    }
}
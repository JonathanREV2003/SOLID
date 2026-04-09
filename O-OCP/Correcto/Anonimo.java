package Correcto;

public class Anonimo implements Usuario {

    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso: Solo lectura");
    }
}

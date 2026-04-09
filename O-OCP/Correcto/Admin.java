package Correcto;

public class Admin implements Usuario {

    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso: Lectura, escritura y modificación");
    }
}

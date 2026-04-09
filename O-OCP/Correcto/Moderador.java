package Correcto;

public class Moderador implements Usuario {

    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso: Lectura y escritura");
    }
}

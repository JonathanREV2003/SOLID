package Correcto;

public class SuperAdmin implements Usuario {

    @Override
    public void mostrarPermisos() {
        System.out.println("Permiso: Todos los permisos del sistema");
    }
}
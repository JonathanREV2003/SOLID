package Incorrecto;
public class PermisoServiceCompleto {

    public void mostrarPermisos(UsuarioCompleto usuario) {

        if (usuario.getTipo().equals("ANONIMO")) {
            System.out.println("Permiso: Solo lectura");
        } 
        else if (usuario.getTipo().equals("MODERADOR")) {
            System.out.println("Permiso: Lectura y escritura");
        } 
        else if (usuario.getTipo().equals("ADMIN")) {
            System.out.println("Permiso: Lectura, escritura y modificación");
        }

        // Si agregamos un "SUPER_ADMIN" o "DUEÑO" del server
        // se tiene que modificar este código violando OCP.
    }
}
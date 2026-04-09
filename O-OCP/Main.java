import Correcto.Admin;
import Correcto.Anonimo;
import Correcto.Moderador;
import Correcto.Usuario;
import Correcto.SuperAdmin;

import Incorrecto.PermisoServiceCompleto;
import Incorrecto.UsuarioCompleto;

public class Main {
    public static void main(String[] args) {

        
        //Forma incorrecta sin utilizar OCP
        PermisoServiceCompleto service = new PermisoServiceCompleto();

        UsuarioCompleto anonimo = new UsuarioCompleto("ANONIMO");
        UsuarioCompleto moderador = new UsuarioCompleto("MODERADOR");
        UsuarioCompleto admin = new UsuarioCompleto("ADMIN");

        service.mostrarPermisos(anonimo);
        service.mostrarPermisos(moderador);
        service.mostrarPermisos(admin);
        

        /* 
        //Forma correcta utilizando OCP
        Usuario anonimo = new Anonimo();
        Usuario moderador = new Moderador();
        Usuario admin = new Admin();
        //Usuario superAdmin = new SuperAdmin();

        anonimo.mostrarPermisos();
        moderador.mostrarPermisos();
        admin.mostrarPermisos();
        //superAdmin.mostrarPermisos();
        */
    }
}

/**
 * --------------------------------------------------------------------
 * EJEMPLO: Principio de Inversion de Dependencias (DIP) - SOLID
 * --------------------------------------------------------------------
 * 
 * El principio DIP establece que las clases de alto nivel no deben depender
 * de las clases de bajo nivel. Ambas deben depender de abstracciones.
 * 
 * Este ejemplo muestra como aplicar DIP usando una interfaz y dependencia injectada.
 * 
 * Ejecutar: cd SOLID/D-DIP -> javac Main.java -> java Main
 * --------------------------------------------------------------------
 */

// ============================================
// INTERFAZ: Contrato que define que se puede hacer
// ============================================
// Nombre: Almacenamiento
// Funcion: Define el metodo guardar() que toda implementacion debe tener
// Esta interfaz representa la abstraccion de "guardar algo"
interface Almacenamiento {
    void guardar(String datos);
}

// ============================================
// CLASE: Implementacion concreta de SQL
// ============================================
// Nombre: BaseDeDatosSQL
// Funcion: Guardar datos en una base de datos SQL (MySQL, PostgreSQL, etc.)
// Esta es una clase de bajo nivel (detalle tecnico)
class BaseDeDatosSQL implements Almacenamiento {
    @Override
    public void guardar(String datos) {
        System.out.println("Guardando en SQL: " + datos);
    }
}

// ============================================
// CLASE: Implementacion concreta de NoSQL
// ============================================
// Nombre: BaseDeDatosNoSQL
// Funcion: Guardar datos en una base de datos NoSQL (MongoDB, etc.)
// Esta es otra implementacion de bajo nivel
class BaseDeDatosNoSQL implements Almacenamiento {
    @Override
    public void guardar(String datos) {
        System.out.println("Guardando en NoSQL: " + datos);
    }
}

// ============================================
// CLASE: logica de negocio
// ============================================
// Nombre: Usuario
// Funcion: Registrar usuarios en el sistema
// Esta es una clase de alto nivel (contiene logica de negocio)
// Depiende de la abstraccion Almacenamiento, no de una implementacion especifica
class Usuario {
    private Almacenamiento almacenamiento;
    
    // Inyeccion de dependencias por constructor
    public Usuario(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    // Metodo de negocio: solo sabe que guardar() existe, no como funciona
    public void registrar(String nombre) {
        almacenamiento.guardar(nombre);
        System.out.println("Usuario registrado correctamente");
    }
}

// ============================================
// PROGRAMA PRINCIPAL
// ============================================
// Nombre: Main
// Funcion: Punto de entrada del programa
// Ejecuta los ejemplos demonstrando el principio DIP
public class Main {
    public static void main(String[] args) {
        // Ejemplo 1: Usar SQL para guardar
        Almacenamiento sql = new BaseDeDatosSQL();
        Usuario usuario1 = new Usuario(sql);
        usuario1.registrar("Juan");
        
        // Ejemplo 2: Cambiar a NoSQL sin modificar la clase Usuario
        Almacenamiento nosql = new BaseDeDatosNoSQL();
        Usuario usuario2 = new Usuario(nosql);
        usuario2.registrar("Maria");
    }
}
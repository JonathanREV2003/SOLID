# PROYECTO SOLID - Principios de Ingeniería de Software

## Integrantes del Grupo

- **Jonathan Ramiro Elías**
- **Melvin Gustavo Cortez**
- **Kevin Alexander Cordon**
- **William Ricardo**

---

## Descripción del Proyecto

Este proyecto implementa ejemplos prácticos y sencillos de los **5 Principios SOLID** en Java. SOLID es un acrónimo que representa cinco principios fundamentales para escribir código mantenible, escalable y de fácil comprensión. Cada principio se acompaña de un ejemplo funcional que demuestra su aplicación correcta.

---

## Principios SOLID Implementados

### S - Principio de Responsabilidad Única (SRP)

**Concepto:**
Cada clase debe tener una única responsabilidad y una única razón para cambiar.

**Problema que resuelve:**
Cuando una clase tiene múltiples responsabilidades, es difícil de entender, probar y mantener. Los cambios en una responsabilidad pueden afectar a otras.

**Cómo se aplica:**
Se separa el código en diferentes clases, cada una encargada de una sola tarea.

**Ejemplo implementado:** (`S-SRP/`)
- **Incorrecto:** La clase `EmpleadoCafe` hace todo: preparar café, despachar y cobrar
- **Correcto:** Se divide en tres clases especializadas:
  - `Barista`: Responsable solo de preparar café
  - `Despachador`: Responsable solo de entregar
  - `Cajero`: Responsable solo de cobrar

Cada clase tiene una única responsabilidad, facilitando mantenimiento y testing.

---

### O - Principio Abierto/Cerrado (OCP)

**Concepto:**
Las clases deben estar abiertas para extensión pero cerradas para modificación.

**Problema que resuelve:**
Cuando el código usa condicionales (if/else) para manejar diferentes tipos, se requiere modificar el código existente cada vez que se añade un nuevo tipo, lo que puede introducir errores.

**Cómo se aplica:**
Se utiliza polimorfismo y herencia para permitir nuevas funcionalidades sin modificar el código existente.

**Ejemplo implementado:** (`O-OCP/`)
- **Incorrecto:** `PermisoServiceCompleto` usa condicionales para cada tipo de usuario
- **Correcto:** Se implementa una interfaz `Usuario` que cada rol (Admin, Moderador, Anónimo, SuperAdmin) extiende, definiendo su propio comportamiento

Agregar nuevos tipos de usuarios no requiere modificar el código existente, solo agregar nuevas clases.

---

### L - Principio de Sustitución de Liskov (LSP)

**Concepto:**
Los objetos de una clase derivada deben poder sustituir a los objetos de su clase base sin alterar el correcto funcionamiento del programa.

**Problema que resuelve:**
Si las subclases no respetan el contrato de la clase base, se generan comportamientos inesperados y errores difíciles de detectar.

**Cómo se aplica:**
Las subclases deben mantener el mismo comportamiento y contrato que la clase base, asegurando que puedan usarse de forma intercambiable.

**Ejemplo implementado:** (`L-LSP/`)
- Clase base: `Figura`
- Subclases: `Rectangulo` y `Cuadrado`
- Ambas respetan el contrato de `Figura`, permitiendo que se usen indistintamente

Las figuras geométricas se comportan correctamente cuando se sustituyen una por otra.

---

### I - Principio de Segregación de Interfaces (ISP)

**Concepto:**
Ninguna clase debe ser obligada a implementar métodos que no utiliza.

**Problema que resuelve:**
Las interfaces grandes con muchos métodos fuerzan a las clases a implementar métodos innecesarios, generando código confuso o vacío.

**Cómo se aplica:**
Se dividen las interfaces grandes en interfaces más pequeñas y específicas, cada una con un propósito claro.

**Ejemplo implementado:** (`I_ISP/`)
- **Incorrecto:** Una interfaz gigante que incluye todos los métodos posibles
- **Correcto:** Se crean dos interfaces segregadas:
  - `Trabajable`: Define lo que puede trabajar
  - `Comible`: Define lo que puede comer

Resultado:
- `Humano` implementa ambas interfaces
- `Robot` solo implementa `Trabajable` (no necesita comer)

---

###  D - Principio de Inversión de Dependencias (DIP)

**Concepto:**
Las clases deben depender de abstracciones, no de implementaciones concretas.

**Problema que resuelve:**
Cuando una clase depende directamente de otras clases concretas, es rígida, difícil de probar y de modificar. Cambiar la implementación requiere modificar la clase dependiente.

**Cómo se aplica:**
Se crea una interfaz que define el contrato, y la inyección de dependencias proporciona la implementación concreta en tiempo de ejecución.

**Ejemplo implementado:** (`D-DIP/`)
- Interfaz: `Almacenamiento` (abstracción)
- Implementaciones concretas: `BaseDeDatosSQL`, `BaseDeDatosNoSQL`
- Clase `Usuario` depende de la interfaz `Almacenamiento`, no de implementaciones específicas

Cambiar la base de datos no requiere modificar la clase `Usuario`, solo inyectar una implementación diferente.

---

## Estructura del Proyecto

```
SOLID/
├── readme.md                           # Este archivo
├── S-SRP/                              # Responsabilidad Única
│   ├── Barista.java
│   ├── Cajero.java
│   ├── Despachador.java
│   ├── EmpleadoCafe.java
│   ├── Main.java
│   └── readme.md
├── O-OCP/                              # Abierto/Cerrado
│   ├── Main.java
│   ├── Correcto/
│   ├── Incorrecto/
│   └── readme.md
├── L-LSP/                              # Sustitución de Liskov
│   ├── src/
│   │   ├── app/
│   │   └── figura/
│   └── readme.md
├── I_ISP/                              # Segregación de Interfaces
│   ├── Comible.java
│   ├── Humano.java
│   ├── Main.java
│   ├── Robot.java
│   ├── Trabajable.java
│   └── readme.md
└── D-DIP/                              # Inversión de Dependencias
    ├── Main.java
    └── readme.md
```

---

## Cómo Usar Este Proyecto

Cada carpeta contiene un ejemplo independiente. Para ejecutar cada principio:

```bash
# Ejemplo SRP
cd SOLID/S-SRP
javac Main.java
java Main

# Ejemplo OCP
cd SOLID/O-OCP
javac Main.java *.java Correcto/*.java Incorrecto/*.java
java Main

# Ejemplo LSP
cd SOLID/L-LSP/src
javac app/*.java figura/*.java
java app.Main

# Ejemplo ISP
cd SOLID/I_ISP
javac Main.java *.java
java Main

# Ejemplo DIP
cd SOLID/D-DIP
javac Main.java
java Main
```

---



Estos cinco principios SOLID son fundamentales para crear software de alta calidad. Su aplicación correcta resulta en:
- ✅ Código más limpio y legible
- ✅ Facilidad para agregar nuevas funcionalidades
- ✅ Mayor mantenibilidad
- ✅ Mejor testabilidad
- ✅ Menor acoplamiento entre componentes
- ✅ Mayor reutilización de código

---

**Repositorio:** [SOLID - GitHub](https://github.com/JonathanREV2003/SOLID) 

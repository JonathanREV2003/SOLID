# Principio de Inversión de Dependencias (DIP)

## ¿Qué es?

DIP dice: **"Depende de abstracciones, no de implementaciones concretas"**
El principio de inversión de dependencias establece que las clases deben depender de abstracciones y no de implementaciones concretas. En este ejemplo, la clase Usuario depende de la interfaz Database y no directamente de MySQLDatabase, haciendo el código más flexible y mantenible.

## El Problema

Si tu clase `Usuario` usa directamente `MySQLDatabase`:
- Para cambiar a PostgreSQL → Tienes que modificar `Usuario`
- No puedes probar sin una base de datos real

## La Solución

1. Crear una **interfaz** (contrato)
2. `Usuario` depende de la interfaz, no de MySQL
3. La base de datos se **inyecta** desde fuera

## Estructura Simple

```
Main
  ↓ crea MySQL/NoSQL
Usuario (usa la interfaz)
  ↓ llama
Interfaz (Almacenamiento)
  ↓ implementa
MySQL / NoSQL
```

## Cómo Ejecutar

```bash
cd SOLID/D-DIP
javac Main.java
java Main
```

## Resumen (para记住)

> "Usuario no sabe cómo se guarda, solo sabe que se guarda"

---

Ver código en `Main.java` con comentarios detallados.

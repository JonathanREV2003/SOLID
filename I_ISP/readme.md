# Principio de Segregación de Interfaces (ISP)

## Descripción
El principio ISP establece que ninguna clase debe ser obligada a implementar métodos que no utiliza.

## Problema
Si una interfaz contiene demasiados métodos, algunas clases implementarán métodos innecesarios, generando código incorrecto o vacío.

## Solución
Se dividen las interfaces en partes más pequeñas y específicas:
- Trabajable
- Comible

## Ejemplo
- Humano implementa ambas interfaces
- Robot solo implementa Trabajable

## Beneficios
- Código más limpio
- Menor acoplamiento
- Mayor mantenibilidad
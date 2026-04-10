# El Principio de Sustitución de Liskov (LSP) establece que:

“Los objetos de una clase derivada deben poder sustituir a los objetos de su clase base sin alterar el correcto funcionamiento del programa.”

Con esto evitamos que la herencia se utilice incorrectamente.

Sin LSP:
- Una subclase puede romper el comportamiento esperado.
- El código que usa la clase base falla al usar la subclase.

Con LSP:
- Las subclases respetan el contrato de la clase padre.
- El código es más reutilizable, seguro y mantenible.


# Actividad Formativa 3 - Herencia

## Descripción
Este proyecto fue desarrollado como parte de la Actividad Formativa 3 de Programación Orientada a Objetos (POO).  
El objetivo es aplicar el concepto de **herencia**, creando clases derivadas que reutilizan atributos y métodos de una clase base.

## Conceptos aplicados
- Herencia
- Reutilización de código
- Clases base y clases derivadas
- Sobrescritura de métodos

## Estructura del proyecto

Clases del programa:

- **Vehiculo (Clase base)**
  - marca
  - velocidad
  - mostrarInfo()

- **Auto (Clase derivada)**
  - puertas
  - mostrarPuertas()

- **Moto (Clase derivada)**
  - casco
  - mostrarCasco()

## Ejemplo de herencia

La clase `Auto` y la clase `Moto` heredan de la clase `Vehiculo` usando la palabra clave:

```java
extends

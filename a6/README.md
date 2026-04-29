# 📘 Actividad 6 — Ordenando a través de tablas

## 🎯 Objetivo

El objetivo de esta actividad es comprender el funcionamiento de las **colecciones en Java** y su relación con los **arrays**, así como aprender a realizar operaciones de ordenación utilizando herramientas propias del lenguaje.

Se trabaja especialmente la conversión entre estructuras de datos y la ordenación de elementos numéricos.

---

## 📋 Enunciado

La actividad consiste en:

- Insertar **20 números enteros aleatorios** comprendidos entre 1 y 100 en una colección.
- Volcar la colección en una tabla de tipo `Integer[]`.
- Ordenar la tabla de menor a mayor.
- Volcar la tabla ordenada en una nueva colección.
- Mostrar por pantalla:
  - La colección original
  - La colección ordenada

Además, se debe responder a la siguiente cuestión:

> ¿Cómo se podría ordenar la colección de mayor a menor?

---

## 🧠 Conceptos trabajados

Durante el desarrollo de esta práctica se aplican los siguientes conceptos:

- `Collection` y `ArrayList` en Java
- Generación de números aleatorios con `Math.random()`
- Conversión entre `Collection` y `Array`
- Ordenación de arrays con `Arrays.sort()`
- Uso de `Arrays.asList()`
- Manipulación de estructuras de datos
- Inversión de orden de elementos

---

## ⚙️ Funcionamiento del programa

### 1. Generación de datos

Se crea una colección vacía y se rellenan 20 números aleatorios entre 1 y 100.

### 2. Conversión a array

La colección se convierte en un array de tipo `Integer[]` para poder aplicar ordenación.

### 3. Ordenación

El array se ordena de forma ascendente utilizando:

```java
Arrays.sort(tabla_de_numeros);

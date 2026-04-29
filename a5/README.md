# 📌 Ejercicio 5: Uso de Métodos Globales en Colecciones (Java)

## 🧾 Descripción

Este proyecto implementa un ejercicio práctico en Java enfocado en el uso de métodos globales de la interfaz `Collection`. El objetivo es manipular colecciones de datos utilizando operaciones estándar proporcionadas por la API de Java.

---

## 🎯 Objetivos

- Trabajar con colecciones dinámicas (`ArrayList`).
- Generar números aleatorios dentro de un rango específico.
- Aplicar métodos globales de la interfaz `Collection`.
- Comprender el funcionamiento de `removeAll()`.

---

## ⚙️ Funcionamiento

El programa realiza los siguientes pasos:

1. Crea una colección de enteros.
2. Genera 100 números aleatorios entre 1 y 10 (incluidos) y los almacena en la colección.
3. Muestra por consola la colección original.
4. Crea una segunda colección que contiene el número `5`.
5. Utiliza el método `removeAll()` para eliminar todas las ocurrencias del número `5` de la colección original.
6. Muestra la colección resultante tras la eliminación.

---

## 🧪 Ejecución

Al ejecutar el programa, se obtendrá una salida similar a la siguiente:

```bash
Colección original:
[3, 5, 7, 1, 5, 9, 2, ...]

Colección sin el número 5:
[3, 7, 1, 9, 2, ...]

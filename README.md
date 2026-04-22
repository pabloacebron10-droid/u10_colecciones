# 📦 Unidad 10: Colecciones en Java

## 🧩 Descripción

Esta unidad introduce el uso de **colecciones en Java**, una alternativa más flexible y potente a los arrays tradicionales.  

Las colecciones permiten almacenar y manipular grupos de objetos de forma dinámica, facilitando el desarrollo de aplicaciones más eficientes y seguras.

---

## 🎯 Objetivos

- Comprender las limitaciones de los arrays.
- Utilizar estructuras dinámicas mediante el **Collections Framework**.
- Aplicar **tipos genéricos** para garantizar seguridad de tipos.
- Conocer las principales interfaces: `List`, `Set` y `Map`.
- Utilizar la clase `Collections` para operaciones comunes.

---

## 📚 Contenidos

- 10.1 Introducción  
- 10.2 Tipos genéricos  
- 10.3 El framework Collection  
- 10.4 Listas (`List`)  
- 10.5 Conjuntos (`Set`)  
- 10.6 Mapas / Diccionarios (`Map`)  
- 10.7 La clase `Collections`  

---

## 🔍 10.1 Introducción

### ❗ Problema de los Arrays

- Tamaño fijo.
- Difícil de redimensionar.
- Ineficiente al añadir o eliminar elementos.

### ✅ Solución: Colecciones

- Estructuras dinámicas.
- Crecen y decrecen automáticamente.
- Pertenecen al paquete `java.util`.

---

## 🧠 10.2 Tipos Genéricos

### 📌 ¿Qué son?

Permiten definir clases, interfaces o métodos que trabajan con distintos tipos de datos de forma segura.

### ⚠️ Antes de Java 5

- Uso de `Object`.
- Necesidad de casting.
- Posibles errores en ejecución (`ClassCastException`).

### ✅ Con genéricos

- Comprobación en tiempo de compilación.
- Mayor seguridad (**type safety**).

### ✨ Ejemplo

```java
// Forma moderna con genéricos
Contenedor<String> c = new Contenedor<>();
c.guardar("Hola");
